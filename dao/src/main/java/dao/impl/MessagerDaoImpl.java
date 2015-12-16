package dao.impl;

import core.model.ContactDto;
import core.model.MassegeDto;
import dao.MassegeDao;

import dao.entity.Contact;
import dao.entity.FriendShip;
import dao.entity.Massege;

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
public class MessagerDaoImpl implements MassegeDao {


    @Autowired
    private SessionFactory sessionFactory;


    @Transactional(readOnly = false) @Override
    public void addMessage(MassegeDto massegeDto) {

        Massege massege=convert(massegeDto);
        sessionFactory.getCurrentSession().save(massege);
    }

    @Transactional(readOnly = false)
    public void deleteMessage(MassegeDto massegeDto) {

        Massege massege=convert(massegeDto);
        sessionFactory.getCurrentSession().delete(massege);
    }

    @Override
    public List<MassegeDto> getConversation(ContactDto contactDto1, ContactDto contactDto2) {

       /* int id1 = contactDto1.getIdContact();
        int id2 = contactDto2.getIdContact();
        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("select i from Contact i where i.IDCONTACT1 = :id1")
                .setParameter("id1",id1).list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (Contact contact : contacts) {
            result.add(convert(contact));

        }
        return result;*/

        return null;
    }
}
