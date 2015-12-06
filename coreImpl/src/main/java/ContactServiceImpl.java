import core.model.ContactDto;
import core.model.HobbyDto;
import core.model.MassegeDto;
import core.model.PlaceDto;
import dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by ������������� on 10.09.15.
 */

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private SecurityDao securityDao;
    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private MassegeDao massegeDao;
    @Autowired
    private PlaceDao placeDao;
    @Autowired
    private FriendShipDao friendShipDao;


    public void createContact(String login, String password) {

    }

    public void addContact(String firstName, String lastName, LocalDate date) {

    }

    public void addHobby(String title, String description) {

    }

    public void addPlace(String title, String description) {

    }

    public void addFriendship(ContactDto contact, ContactDto contactFriend) {

    }

    public List<ContactDto> getFriendList(ContactDto contact) {
        return null;
    }

    public List<MassegeDto> getMasseges(ContactDto contact, ContactDto contactFriend) {
        return null;
    }

    public Collection<ContactDto> getAllContacts() {
        return null;
    }

    public Collection<HobbyDto> getAllHobby() {
        return null;
    }

    public Collection<MassegeDto> getAllMassege() {
        return null;
    }

    public Collection<PlaceDto> getAllPlace() {
        return null;
    }

    public void clearAll() {

    }
}

