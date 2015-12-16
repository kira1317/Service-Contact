package dao;


import core.model.PlaceDto;
import dao.entity.Contact;
import dao.entity.Place;

import java.util.List;
import java.util.Set;

/**
 * Created by ����� on 04.11.2015.
 */
public interface PlaceDao {

    void addPlace(PlaceDto placeDto);
    void deletePlace(PlaceDto place);
    List<PlaceDto> getAllContacts();

}
