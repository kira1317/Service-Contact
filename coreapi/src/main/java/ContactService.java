import core.model.ContactDto;
import core.model.HobbyDto;
import core.model.MassegeDto;
import core.model.PlaceDto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by ������������� on 10.09.15.
 */
public interface ContactService {

    void createContact(String login,String password);

    void addContact(String firstName, String lastName, LocalDate date);
    void addHobby(String title, String description);
    void addPlace(String title, String description);

    void addFriendship(ContactDto contact, ContactDto contactFriend);
    List<ContactDto> getFriendList(ContactDto contact);
    List<MassegeDto> getMasseges(ContactDto contact, ContactDto contactFriend);

    Collection<ContactDto> getAllContacts();
    Collection<HobbyDto> getAllHobby();
    Collection<MassegeDto> getAllMassege();
    Collection<PlaceDto> getAllPlace();

    void clearAll();



}
