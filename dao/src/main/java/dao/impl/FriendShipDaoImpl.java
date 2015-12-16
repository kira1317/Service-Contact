package dao.impl;

import core.model.ContactDto;
import dao.FriendShipDao;
import dao.entity.Contact;
import dao.entity.FriendShip;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static dao.converts.EntityDtoConverter.convert;

/**
 * Created by Администратор on 15.12.15.
 */
@Repository
@Transactional(readOnly = true)

public class FriendShipDaoImpl implements FriendShipDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly = false)
    public void addFriendShip(ContactDto contactDto1, ContactDto contactDto2) {
        Contact contact1=convert(contactDto1);
        Contact contact2=convert(contactDto2);
        FriendShip friendShip=new FriendShip();
        friendShip.setContact1(contact1);
        friendShip.setContact1(contact2);
        sessionFactory.getCurrentSession().save(friendShip);
    }

    @Transactional(readOnly = false)
    public void removeFriendShip(ContactDto contactDto1, ContactDto contactDto2) {
        Contact contact1=convert(contactDto1);
        Contact contact2=convert(contactDto2);
        FriendShip friendShip=new FriendShip();
        friendShip.setContact1(contact1);
        friendShip.setContact1(contact2);
        sessionFactory.getCurrentSession().delete(friendShip);
    }

    @Override
    public List<ContactDto> allFriendShip(ContactDto contactDto) {

        int id = contactDto.getIdContact();
        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("select i from Contact i where i.id = :id")
                .setParameter("id",id).list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (Contact contact : contacts) {
            result.add(convert(contact));

        }
        return result;
    }
}
