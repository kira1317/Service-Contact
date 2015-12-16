package dao.impl;

import core.model.ContactDto;
import core.model.HobbyDto;
import dao.ContactDao;
import dao.HobbyDao;
import dao.entity.Contact;
import dao.entity.Hobby;
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


public class HobbyDaoImpl implements HobbyDao {



   @Autowired
   private SessionFactory sessionFactory;


    @Transactional(readOnly = false)
    public void addHobby(HobbyDto hobbyDto) {
        Hobby hobby = convert(hobbyDto);
        sessionFactory.getCurrentSession().save(hobby);
    }

    @Override
    public List<HobbyDto> getAllHobby() {

        List<Hobby> hobbies = sessionFactory.getCurrentSession().createQuery("from Hobby ").list();
        List<HobbyDto> result = new ArrayList<HobbyDto>(hobbies.size());
        for (Hobby hobby : hobbies) {
            result.add(convert(hobby));

        }
        return result;

    }

    @Transactional(readOnly = false)
    @Override
    public void deleteHobby(HobbyDto hobbyDto) {
        Hobby hobby = convert(hobbyDto);
        sessionFactory.getCurrentSession().delete(hobby);
    }



}
