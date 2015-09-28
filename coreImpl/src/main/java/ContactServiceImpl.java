import core.model.Contact;
import core.model.Message;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Администратор on 10.09.15.
 */
public class ContactServiceImpl implements ContactService {

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
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Collection<Contact> getAllHobby() {
        return null;
    }

    @Override
    public Collection<Contact> getAllMessage() {
        return null;
    }

    @Override
    public Collection<Contact> getAllPlace() {
        return null;
    }

    @Override
    public void clearAll() {

    }
}
