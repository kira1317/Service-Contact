package dao;

import core.model.ContactDto;
import dao.entity.Contact;

import java.util.List;

/**
 * Created by Администратор on 02.12.15.
 */
public interface FriendShipDao {

    void addFriendShip(ContactDto contactDto1, ContactDto contactDto2);
    void removeFriendShip(ContactDto contact1, ContactDto contactDto2);
    List<ContactDto> allFriendShip(ContactDto contactDto);

}
