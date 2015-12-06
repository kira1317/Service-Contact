package dao.impl;

import dao.PlaceDao;
import dao.entity.Contact;
import dao.entity.Place;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by ����� on 04.11.2015.
 */
@Repository
@Transactional(readOnly = true)


public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;



    public void addPlace(Place place) {

    }

    public void deletePlace(Place place) {

    }

    public Set<Contact> getAllContacts(Place place) {
        return null;
    }


}
