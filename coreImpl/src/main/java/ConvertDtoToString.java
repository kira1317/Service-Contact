import core.model.ContactDto;
import core.model.HobbyDto;
import core.model.PlaceDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Администратор on 18.12.15.
 */
public class ConvertDtoToString {

    public List<String> covertDtoToStringHobby(Collection<HobbyDto> hobbyDtos){

        List<String> allHobbyTitle= new ArrayList<String>();
        for(HobbyDto hobbyDto: hobbyDtos){

            allHobbyTitle.add(hobbyDto.getTitle());

        }

        return allHobbyTitle;
    }

    public List<String> covertDtoToStringPlace(Collection<PlaceDto> placeDtos) {

        List<String> allPlaceTitle= new ArrayList<String>();
        for(PlaceDto placeDto: placeDtos){

            allPlaceTitle.add(placeDto.getTitle());

        }
        return allPlaceTitle;
    }


    public List<String> covertDtoToStringContacts(Collection<ContactDto> contactDtos) {

        List<String> allContacts= new ArrayList<String>();
        for(ContactDto contactDto: contactDtos){

            allContacts.add(contactDto.getFirstName()+" "+ contactDto.getLastName());

        }
        return  allContacts;

    }

}
