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

        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("from Contact").list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (Contact contact : contacts) {
            result.add(convert(contact));

        }
        return result;

    }

    @Override
    public ContactDto findContact(ContactDto contactDto) {

        int id=contactDto.getIdContact();
        List<Contact> contacts = sessionFactory.getCurrentSession()
                .createQuery("select i from Contact i where i.id = :id")
                .setParameter("id",id).list();
        if (contacts.isEmpty()) {
            return null;
        }

        return convert(contacts.get(0));

    }


    @Transactional(readOnly = false)
    public void addContact(ContactDto contactDto) {
        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().save(contact);
    }

    @Transactional(readOnly = false)
    public void editContact(ContactDto contactDto) {
        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);

    }

    @Transactional(readOnly = false)
    public void deleteContact(ContactDto contactDto) {
        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().delete(contact);
    }



}
