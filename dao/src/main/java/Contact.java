import java.time.LocalDate;
import java.util.Set;


/**
 * Created by Администратор on 10.09.15.
 */
public class Contact {



    private final int idContact;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> plases;

    public Contact(int idContact, String firstName, String lastName, LocalDate birthDate, Set<Hobby> hobbies, Set<Place> plases) {
        this.idContact = idContact;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
        this.plases = plases;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public Set<Place> getPlases() {
        return plases;
    }

    public int getIdContact() {
        return idContact;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", plases=" + plases +
                '}';
    }



}
