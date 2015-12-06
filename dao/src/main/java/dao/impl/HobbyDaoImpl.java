package dao.impl;

import dao.ContactDao;
import dao.HobbyDao;
import dao.entity.Hobby;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ����� on 04.11.2015.
 */
@Repository
@Transactional(readOnly = true)


public class HobbyDaoImpl implements HobbyDao {



   @Autowired
   private SessionFactory sessionFactory;




    public void addHobby(Hobby hobby) {

    }

    public void getAllHobby(Hobby hobby) {

    }



}
