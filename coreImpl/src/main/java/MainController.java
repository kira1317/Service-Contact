import core.model.ContactDto;
import core.model.HobbyDto;
import core.model.PlaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    private ContactServiceImpl contactService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getContactInformation(Model model) {


        ContactDto contactDto=contactService.getContact(1);
        model.addAttribute("Contact",contactDto);
        model.addAttribute("HobbyAll",contactService.getAllHobby());
        model.addAttribute("HobbyContact",contactDto.getHobbies());
        model.addAttribute("PlaceAll",contactService.getAllPlace());
        model.addAttribute("PlaceContact",contactDto.getPlases());
        model.addAttribute("ContactAll", contactService.getAllContacts());
        model.addAttribute("FriendShipAll",contactDto.getFriend());

        model.addAttribute("MassegeAll", contactDto.getMessageDto());


        return "home";
    }


 /* @ResponseBody
    @RequestMapping(value = "/barStatus", method = RequestMethod.GET)
    public ResponseMessage getBarStatus() {
        return ResponseMessage.okMessage(bar.getBarStatus());
    }

    @ResponseBody
    @RequestMapping(value = "/clientOrder", method = RequestMethod.POST)
    public ResponseMessage executeClientOrder(@RequestBody ClientOrder clientOrder) {
        return ResponseMessage.okMessage(bar.executeClientOrder(clientOrder));
    }

    @ResponseBody
    @RequestMapping(value = "/refillOrder", method = RequestMethod.POST)
    public ResponseMessage executeRefillOrder(@RequestBody RefillOrder refillOrder) {
        return ResponseMessage.okMessage(bar.executeRefillOrder(refillOrder));
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseMessage handleException(Exception e) {
        return ResponseMessage.errorMessage(e.getMessage());
    }
*/
}
