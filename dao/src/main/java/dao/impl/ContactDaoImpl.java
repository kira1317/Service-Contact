package dao.impl;

import core.model.ContactDto;
import dao.ContactDao;
import dao.entity.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static dao.converts.EntityDtoConverter.convert;

/**
 * Created by ����� on 04.11.2015.
 */

@Repository
@Transactional(readOnly = true)
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;


    public List<ContactDto> allContact(){

        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("from ContactService").list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (Contact contact : contacts) {
            result.add(convert(contact));
            System.out.println(contact.getFirstName()+" "+contact.getLastName());
        }
        return result;

    }

    @Override
    public ContactDto findContact(int id) {
        List<Contact> contacts = sessionFactory.getCurrentSession()
                .createQuery("select i from ContactService i where i.id = :id")
                .setParameter("id",id).list();
        if (contacts.isEmpty()) {
            return null;
        }

        return convert(contacts.get(0));

    }



    public void addContact(Contact contact) {

    }

    public void editContact(Contact contact) {


    }

    public void deleteContact(Contact contact) {

    }



}
