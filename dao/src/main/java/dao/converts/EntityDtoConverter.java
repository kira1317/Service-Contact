package dao.converts;

import core.model.*;
import dao.entity.*;

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


       /// contact.setHobbes(contactDto.getHobbies());
   ///     contact.setPlaces(contactDto.getPlases());
    ///    contact.setMassege(contactDto.getMessageDto());
     ///   contact.setSecurity(contactDto.getSecurityDto());

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

      /// contactDto.setHobbies(contact.getHobbes());
       //// contactDto.setPlases(contact.getPlaces());
       /// contactDto.setMessageDto(contact.getMassege());
      ///  contactDto.setFriend(contact.getFriend());

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

       // massege.setId(massegeDto.getIdMasseger());
        massege.setContent(massegeDto.getContent());
   //     massege.setFrom(massegeDto.getFrom());
   //     massege.setTo(massegeDto.getFrom());

        return massege;
    }
    public static MassegeDto convert(Massege massege){


        if(massege == null){
            return null;
        }

        MassegeDto massegeDto=new MassegeDto();

        massegeDto.setContent(massege.getContent());
        massegeDto.setContent(massege.getContent());
     //   massegeDto.getTo(massege.getTo());
      //  massegeDto.setFrom(massege.getFrom());

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
