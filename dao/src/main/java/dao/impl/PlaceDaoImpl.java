package dao.impl;

import core.model.PlaceDto;
import dao.PlaceDao;
import dao.entity.Place;
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


public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional(readOnly = false)
    public void addPlace(PlaceDto placeDto) {
        Place place = convert(placeDto);
        sessionFactory.getCurrentSession().save(place);
    }

    @Transactional(readOnly = false)
    public void deletePlace(PlaceDto placeDto) {
        Place place = convert(placeDto);
        sessionFactory.getCurrentSession().delete(place);
    }


    public List<PlaceDto> getAllContacts() {

        List<Place> places = sessionFactory.getCurrentSession().createQuery("from Place ").list();
        List<PlaceDto> result = new ArrayList<>(places.size());
        for (Place place : places) {

            result.add(convert(place));

        }
        return result;

    }



}
