package ua.service.contact.dao.service.impl;

import org.springframework.stereotype.Repository;

import core.model.Contact;
import core.model.Place;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Администратор on 10.09.15.
 */
@Repository
public class PlaseDao {

    private Map<String,Place> servisePlase= new HashMap<String,Place>();

    public Collection<Place> getAll() {
        return servisePlase.values();
    }

    public void addPlace (Place place){


    }
    public Set<Contact> getAllContactsForPlace(Place place){

        return null;

    }

}
