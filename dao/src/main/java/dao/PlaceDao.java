package dao;


import dao.entity.Contact;
import dao.entity.Place;

import java.util.Set;

/**
 * Created by ����� on 04.11.2015.
 */
public interface PlaceDao {

    void addPlace(Place place);
    void deletePlace(Place place);
    Set<Contact> getAllContacts(Place place);

}
