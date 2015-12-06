package dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ������������� on 10.09.15.
 */

@Entity
@Table(name = "CONTACT")

public class Contact{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int idContact;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;


    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDATE")
    private Date birthDate;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinTable(
            name = "SECURITY",
            inverseJoinColumns = @JoinColumn(name = "SECURITY_ID")

    )
    private Security security;

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "HOBBY_CONTACT",
            inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"),
            joinColumns = @JoinColumn(name = "HOBBY_ID")
    )
    private Set<Hobby> hobbes= new HashSet<Hobby>();

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "PLACES_CONTACT",
            inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"),
            joinColumns = @JoinColumn(name = "PLACE_ID")
    )
    private Set<Place> places=new HashSet<Place>();




    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "FRIENDSHIP",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "FRIEND_ID")
    )
    private Set<Contact> contactsFriends;

    /*@ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "MASSEGE",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "IDCONTACT1")
    )*/
    @Transient
    private Set<Massege> massege;




    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Set<Hobby> getHobbes() {
        return hobbes;
    }

    public void setHobbes(Set<Hobby> hobbes) {
        this.hobbes = hobbes;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public Set<Massege> getMassege() {
        return massege;
    }

    public void setMassege(Set<Massege> massege) {
        this.massege = massege;
    }

    public Set<Contact> getContactsFriends() {
        return contactsFriends;
    }

    public void setContactsFriends(Set<Contact> contactsFriends) {
        this.contactsFriends = contactsFriends;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", security=" + security +
                ", hobbes=" + hobbes +
                ", places=" + places +
                ", massege=" + massege +
                ", contactsFriends=" + contactsFriends +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (idContact != contact.idContact) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(contact.birthDate) : contact.birthDate != null) return false;
        if (security != null ? !security.equals(contact.security) : contact.security != null) return false;
        if (hobbes != null ? !hobbes.equals(contact.hobbes) : contact.hobbes != null) return false;
        if (places != null ? !places.equals(contact.places) : contact.places != null) return false;
        if (massege != null ? !massege.equals(contact.massege) : contact.massege != null) return false;
        return !(contactsFriends != null ? !contactsFriends.equals(contact.contactsFriends) : contact.contactsFriends != null);

    }

    @Override
    public int hashCode() {
        int result = idContact;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (security != null ? security.hashCode() : 0);
        result = 31 * result + (hobbes != null ? hobbes.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (massege != null ? massege.hashCode() : 0);
        result = 31 * result + (contactsFriends != null ? contactsFriends.hashCode() : 0);
        return result;
    }
}
