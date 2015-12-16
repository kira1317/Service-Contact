package dao.converts;

import core.model.*;
import dao.entity.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ����� on 05.11.2015.
 */
public class EntityDtoConverter {

    public static Security convert(SecurityDto securityDto){

        if(securityDto == null){
            return null;
        }
        Security security=new Security();

        security.setIdContact(securityDto.getIdSecurity());
        security.setLogin(securityDto.getLogin());
        security.setPass(securityDto.getPass());

        return security;
    }
    public static SecurityDto convert(Security security){

        if(security == null){
            return null;
        }

        SecurityDto securityDto=new SecurityDto();

        securityDto.setIdSecurity(security.getIdContact());
        securityDto.setLogin(security.getLogin());
        securityDto.setPass(security.getPass());

        return securityDto;
    }



    public static Contact convert(ContactDto contactDto){

         if(contactDto == null){
             return null;
         }
        Contact contact=new Contact();
        contact.setIdContact(contactDto.getIdContact());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setBirthDate(contactDto.getBirthDate());

        Set<Hobby> hobbies=new HashSet<Hobby>();
        for (HobbyDto hobby: contactDto.getHobbies()){

            hobbies.add(convert(hobby));

        }
        contact.setHobbes(hobbies);

        Set<Place> places=new HashSet<Place>();
        for (PlaceDto place: contactDto.getPlases()){

            places.add(convert(place));

        }
        contact.setPlaces(places);



        Set<Massege> masseges=new HashSet<Massege>();
        for (MassegeDto messageDto: contactDto.getMessageDto()){

            masseges.add(convert(messageDto));

        }
        contact.setMassege(masseges);


        Security security=new Security();
        security.setIdContact(contactDto.getSecurityDto().getIdSecurity());
        security.setLogin(contactDto.getSecurityDto().getLogin());
        security.setPass(contactDto.getSecurityDto().getPass());
        contact.setSecurity(security);



        Set<Contact> friends=new HashSet<Contact>();
        for (ContactDto friend: contactDto.getFriend()){

            friends.add(convert(friend));

        }
        contact.setContactsFriends(friends);

        return contact;
    }

    public static ContactDto convert(Contact contact){

        if(contact == null){
            return null;
        }

        ContactDto contactDto=new ContactDto();

        contactDto.setIdContact(contact.getIdContact());
        contactDto.setFirstName(contact.getFirstName());
        contactDto.setLastName(contact.getLastName());
        contactDto.setBirthDate(contact.getBirthDate());


        Set<HobbyDto> hobbies=new HashSet<HobbyDto>();
        for (Hobby hobby: contact.getHobbes()){

            hobbies.add(convert(hobby));

        }
        contactDto.setHobbies(hobbies);

        Set<PlaceDto> places=new HashSet<PlaceDto>();
        for (Place place: contact.getPlaces()){

            places.add(convert(place));

        }
        contactDto.setPlases(places);


        Set<MassegeDto> masseges=new HashSet<MassegeDto>();
        for (Massege message: contact.getMassege()){

            masseges.add(convert(message));

        }
        contactDto.setMessageDto(masseges);



        SecurityDto securityDto=new SecurityDto();
        securityDto.setIdSecurity(contactDto.getSecurityDto().getIdSecurity());
        securityDto.setLogin(contactDto.getSecurityDto().getLogin());
        securityDto.setPass(contactDto.getSecurityDto().getPass());
        contactDto.setSecurityDto(securityDto);




        Set<ContactDto> friends=new HashSet<ContactDto>();
        for (Contact friend: contact.getContactsFriends()){

            friends.add(convert(contact));

        }
        contactDto.setFriend(friends);

        return contactDto;
    }



    public static Hobby convert(HobbyDto hobbyDto){

        if(hobbyDto == null){
            return null;
        }

        Hobby hobby=new Hobby();

        hobby.setId(hobbyDto.getIdHobby());
        hobby.setTitle(hobbyDto.getTitle());
        hobby.setDescription(hobbyDto.getDescription());

        return hobby;
    }

    public static HobbyDto convert(Hobby hobby){

        if(hobby == null){
            return null;
        }

        HobbyDto hobbyDto=new HobbyDto();
        hobbyDto.setIdHobby(hobby.getId());
        hobbyDto.setDescription(hobby.getDescription());
        hobbyDto.setTitle(hobby.getTitle());

        return hobbyDto;
    }

    public static Massege convert(MassegeDto massegeDto){

        if(massegeDto == null){
            return null;
        }

          Massege massege=new Massege();

          massege.setIdMasseger(massegeDto.getIdMasseger());
          massege.setContent(massegeDto.getContent());
          massege.setFrom(massegeDto.getFrom());
          massege.setDateMassege(massegeDto.getDateMassege());
          massege.setTo(convert(massegeDto.getTo()));

        return massege;
    }

    public static MassegeDto convert(Massege massege){


        if(massege == null){
            return null;
        }

        MassegeDto massegeDto=new MassegeDto();

        massegeDto.setIdMasseger(massege.getIdMasseger());
        massegeDto.setContent(massege.getContent());
        massegeDto.setDateMassege(massege.getDateMassege());
        massegeDto.setFrom(massege.getFrom());
        massegeDto.setTo(convert(massege.getTo()));


        return massegeDto;
    }


    public static Place convert(PlaceDto placeDto){

        if(placeDto == null){
            return null;
        }

        Place place=new Place();
        place.setId(placeDto.getIdPlace());
        place.setTitle(placeDto.getTitle());
        place.setDescription(placeDto.getDescription());

        return place;
    }

    public static PlaceDto convert(Place place){

        if(place == null){
            return null;
        }

        PlaceDto placeDto=new PlaceDto();

        placeDto.setIdPlace(place.getId());
        placeDto.setDescription(place.getDescription());
        placeDto.setTitle(place.getTitle());

        return placeDto;
    }

}
