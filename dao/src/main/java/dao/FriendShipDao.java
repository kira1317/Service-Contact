package dao;

import dao.entity.Contact;

/**
 * Created by Администратор on 02.12.15.
 */
public interface FriendShipDao {

    void addFriendShip(Contact contact1, Contact contact2);
    void removeFriendShip(Contact contact1, Contact contact2);

}
