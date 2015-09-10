import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Администратор on 10.09.15.
 */
public interface ContactService {

    ContactDao contactDao = null;
    HobbyDao hobbyDao = null;
    PlaseDao placeDao = null;
    MessagerDao messageDao = null;

    void createContact(String login,String password,LocalDate date);
    void addHobby(String title, String description);
    void addPlace(String title, String description, double latitude, double longitude);
    void addFriendship(Contact contact, Contact contactFriend);
    Set<Contact> getFriendList(Contact contact);
    List<Message> getConversation(Contact contact, Contact contactFriend);





}
