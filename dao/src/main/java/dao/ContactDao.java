package dao;

import core.model.ContactDto;
import dao.entity.Contact;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by ����� on 04.11.2015.
 */
public interface ContactDao {

    List<ContactDto> allContact();
    ContactDto findContact(int id);
    void addContact(Contact contact);
    void editContact(Contact contact);
    void deleteContact(Contact contact);
}
