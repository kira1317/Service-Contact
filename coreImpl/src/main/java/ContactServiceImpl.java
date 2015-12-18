import core.model.*;
import dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;



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


    public ContactDto getContact(int id) {
        ContactDto contactDto=new ContactDto();
        contactDto.setIdContact(id);
        return contactDao.findContact(contactDto);
    }

    public void createContact(String login, String password) {

        SecurityDto securityDto=new SecurityDto();
        securityDto.setLogin(login);
        securityDto.setPass(password);
        securityDao.addSecurity(securityDto);

    }

    public void addContact(String firstName, String lastName, Date date) {

        ContactDto contactDto=new ContactDto();
        contactDto.setFirstName(firstName);
        contactDto.setLastName(lastName);
        contactDto.setBirthDate(date);
        contactDao.addContact(contactDto);

    }

    public void editContact(ContactDto contactDto) {
        contactDao.editContact(contactDto);
    }

    public void addHobby(String title, String description) {

        HobbyDto hobbyDto=new HobbyDto();
        hobbyDto.setTitle(title);
        hobbyDto.setDescription(description);
        hobbyDao.addHobby(hobbyDto);

    }

    public void deleteHobby(HobbyDto hobbyDto) {

        hobbyDao.deleteHobby(hobbyDto);
    }

    public void addPlace(String title, String description) {

        PlaceDto placeDto=new PlaceDto();
        placeDto.setTitle(title);
        placeDto.setDescription(description);
        placeDao.addPlace(placeDto);
    }

    public void deletePlace(PlaceDto placeDto) {

        placeDao.deletePlace(placeDto);
    }

    public void addFriendship(ContactDto contact, ContactDto contactFriend) {

        friendShipDao.addFriendShip(contact,contactFriend);
    }

    public List<ContactDto> getFriendList(ContactDto contact) {

        return  friendShipDao.allFriendShip(contact);

    }

    public void deleteFriendship(ContactDto contact, ContactDto contactFriend) {

        friendShipDao.removeFriendShip(contact,contactFriend);

    }

    public void addMassege(ContactDto contact, ContactDto contactFriend, String text) {
        MassegeDto massegeDto=new MassegeDto();
        massegeDto.setFrom(contact.getIdContact());
        massegeDto.setTo(contactFriend);
        Date date=new Date();
        massegeDto.setDateMassege(date);
        massegeDto.setContent(text);
        massegeDao.addMessage(massegeDto);
    }


    public List<MassegeDto> getMassegeList(ContactDto contact1, ContactDto contact2) {

      return massegeDao.getConversation(contact1, contact2);

    }

    public void deleteMassege(ContactDto contact, ContactDto contactFriend ) {

        MassegeDto massegeDto=new MassegeDto();
        massegeDto.setFrom(contact.getIdContact());
        massegeDto.setTo(contactFriend);
        massegeDao.deleteMessage(massegeDto);

    }

    public Collection<ContactDto> getAllContacts()
    {
        return  contactDao.allContact();
    }

    public Collection<HobbyDto> getAllHobby() {

        return hobbyDao.getAllHobby();
    }


    public Collection<PlaceDto> getAllPlace() {

        return placeDao.getAllContacts();
    }

    public void clear(ContactDto contact) {


        securityDao.deleteSecurity(contact.getSecurityDto());
        contactDao.deleteContact(contact);

    }










}

