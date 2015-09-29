import core.model.Contact;
import core.model.Message;
import core.model.Place;
import ua.service.contact.dao.service.impl.ContactDao;
import ua.service.contact.dao.service.impl.HobbyDao;
import ua.service.contact.dao.service.impl.MessagerDao;
import ua.service.contact.dao.service.impl.PlaseDao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Администратор on 10.09.15.
 */

@Service
public class ContactServiceImpl implements ContactService {


    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private MessagerDao messagerDao;
    @Autowired
    private PlaseDao plaseDao;


    @Override
    public void createContact(String login, String password, LocalDate date) {

    }

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void addPlace(String title, String description, double latitude, double longitude) {

    }

    @Override
    public void addFriendship(Contact contact, Contact contactFriend) {

    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact contact, Contact contactFriend) {
        return null;
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return contactDao.getAll();
    }

    @Override
    public Collection<String> getAllHobby() {
        return hobbyDao.getAll();
    }

    @Override
    public Collection<Message> getAllMessage() {
        return messagerDao.getAll();
    }

    @Override
    public Collection<Place> getAllPlace() {
        return plaseDao.getAll();
    }

    @Override
    public void clearAll() {



    }
}
