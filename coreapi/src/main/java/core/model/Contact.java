package core.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


/**
 * Created by Администратор on 10.09.15.
 */
public class Contact implements Serializable {



    private final int idContact;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> plases;

    public Contact(int idContact) {
        this.idContact = idContact;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public void setPlases(Set<Place> plases) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (idContact != contact.idContact) return false;
        if (!firstName.equals(contact.firstName)) return false;
        if (!lastName.equals(contact.lastName)) return false;
        if (!birthDate.equals(contact.birthDate)) return false;
        if (!hobbies.equals(contact.hobbies)) return false;
        return plases.equals(contact.plases);

    }

    @Override
    public int hashCode() {
        int result = idContact;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + hobbies.hashCode();
        result = 31 * result + plases.hashCode();
        return result;
    }
}
