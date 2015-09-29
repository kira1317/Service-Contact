import core.model.Contact;
import core.model.Message;
import core.model.Place;
import ua.service.contact.dao.service.impl.ContactDao;
import ua.service.contact.dao.service.impl.HobbyDao;
import ua.service.contact.dao.service.impl.MessagerDao;
import ua.service.contact.dao.service.impl.PlaseDao;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Администратор on 10.09.15.
 */
public interface ContactService {

    void createContact(String login,String password,LocalDate date);
    void addHobby(String title, String description);
    void addPlace(String title, String description, double latitude, double longitude);
    void addFriendship(Contact contact, Contact contactFriend);
    Set<Contact> getFriendList(Contact contact);
    List<Message> getConversation(Contact contact, Contact contactFriend);

    Collection<Contact> getAllContacts();
    Collection<String> getAllHobby();
    Collection<Message> getAllMessage();
    Collection<Place> getAllPlace();
    void clearAll();



}
