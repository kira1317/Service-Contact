package core.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


/**
 * Created by ������������� on 10.09.15.
 */

public class ContactDto implements Serializable {




    private int idContact;
    private String firstName;
    private String lastName;
    private Date birthDate;

    private SecurityDto securityDto;
    private Set<HobbyDto> hobbes;
    private Set<PlaceDto> places;
    private Set<ContactDto> friend;
    private Set<MassegeDto> massegeDto;

    @Override
    public String toString() {
        return "ContactDto{" +
                "idContact=" + idContact +
                ", securityDto=" + securityDto +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbes=" + hobbes +
                ", places=" + places +
                ", friend=" + friend +
                ", massegeDto=" + massegeDto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDto that = (ContactDto) o;

        if (idContact != that.idContact) return false;
        if (securityDto != null ? !securityDto.equals(that.securityDto) : that.securityDto != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (hobbes != null ? !hobbes.equals(that.hobbes) : that.hobbes != null) return false;
        if (places != null ? !places.equals(that.places) : that.places != null) return false;
        if (friend != null ? !friend.equals(that.friend) : that.friend != null) return false;
        return !(massegeDto != null ? !massegeDto.equals(that.massegeDto) : that.massegeDto != null);

    }

    @Override
    public int hashCode() {
        int result = idContact;
        result = 31 * result + (securityDto != null ? securityDto.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hobbes != null ? hobbes.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (friend != null ? friend.hashCode() : 0);
        result = 31 * result + (massegeDto != null ? massegeDto.hashCode() : 0);
        return result;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public SecurityDto getSecurityDto() {
        return securityDto;
    }

    public void setSecurityDto(SecurityDto securityDto) {
        this.securityDto = securityDto;
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

    public Set<HobbyDto> getHobbies() {
        return hobbes;
    }

    public void setHobbies(Set<HobbyDto> hobbies) {
        this.hobbes = hobbies;
    }

    public Set<PlaceDto> getPlases() {
        return places;
    }

    public void setPlases(Set<PlaceDto> plases) {
        this.places = plases;
    }

    public Set<ContactDto> getFriend() {
        return friend;
    }

    public void setFriend(Set<ContactDto> friend) {
        this.friend = friend;
    }

    public Set<MassegeDto> getMessageDto() {
        return massegeDto;
    }

    public void setMessageDto(Set<MassegeDto> messageDto) {
        this.massegeDto = massegeDto;
    }
}
