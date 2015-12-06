package dao.impl;

import dao.MassegeDao;

import dao.entity.Contact;
import dao.entity.Massege;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ����� on 04.11.2015.
 */


@Repository
@Transactional(readOnly = true)
public class MessagerDaoImpl implements MassegeDao {


    @Autowired
    private SessionFactory sessionFactory;

    public void storeMessage(Massege massege) {

    }

    public List<Massege> getConversation(Contact contact1, Contact contact2) {
        return null;
    }




}
