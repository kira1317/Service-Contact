import core.model.ContactDto;
import core.model.HobbyDto;
import core.model.MassegeDto;
import core.model.PlaceDto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by ������������� on 10.09.15.
 */
public interface ContactService {

    ContactDto getContact(int id);

    void createContact(String login,String password);

    void addContact(String firstName, String lastName, Date date);
    void editContact(ContactDto contactDto);

    void addHobby(String title, String description);
    void deleteHobby(HobbyDto hobbyDto);

    void addPlace(String title, String description);
    void deletePlace(PlaceDto placeDto);

    void addFriendship(ContactDto contact, ContactDto contactFriend);
    List<ContactDto> getFriendList(ContactDto contact);
    void deleteFriendship(ContactDto contact, ContactDto contactFriend);

    void addMassege(ContactDto contact, ContactDto contactFriend, String text);
    List<MassegeDto> getMassegeList(ContactDto contact1,ContactDto contact2);
    void deleteMassege(ContactDto contact, ContactDto contactFriend);


    Collection<ContactDto> getAllContacts();

    Collection<HobbyDto> getAllHobby();
    Collection<PlaceDto> getAllPlace();

    void clear(ContactDto contact);



}
