import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 10.09.15.
 */
public class ContactDao {

    private Map<Integer,Contact> serviseContact= new HashMap<Integer,Contact>();


    public boolean addContact(Contact contact){



        if (searchContact(contact.getIdContact()) ==null) {

            serviseContact.put(contact.getIdContact(),contact);
            return true;

        }

        return false;

    };
    public void deleteContact(Contact contactDel){

        Contact contact=searchContact(contactDel.getIdContact());
        if (contact != null) {

            serviseContact.remove(contact.getIdContact());
            return;
        }

        System.out.print("Not delete contact");

    };
/////////////////////////////////???????????
    public void addFriendShip(Contact contact, Contact contactFriend){



    };

    public void removeFriendship(Contact contact, Contact contactFriend){

    };
//////////////////////////////?????????????
    public Contact searchContact(int id) {


        if (serviseContact.get(id) != null) {

            return serviseContact.get(id);


        }
        return null;

    }





}
