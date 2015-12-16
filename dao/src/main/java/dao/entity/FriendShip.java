package dao.entity;

import javax.persistence.*;

/**
 * Created by Администратор on 15.12.15.
 */

@Entity
@Table(name = "FRIENDSHIP")

public class FriendShip {


    @OneToOne(cascade={CascadeType.ALL})
    @JoinTable(
            name = "CONTACT",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "ID")
    )
    private Contact contact1;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinTable(
            name = "CONTACT",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "FRIEND_ID")
    )
    private Contact contact2;

    public Contact getContact2() {
        return contact2;
    }

    public void setContact2(Contact contact2) {
        this.contact2 = contact2;
    }

    public Contact getContact1() {
        return contact1;
    }

    public void setContact1(Contact contact1) {
        this.contact1 = contact1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FriendShip that = (FriendShip) o;

        if (contact1 != null ? !contact1.equals(that.contact1) : that.contact1 != null) return false;
        return !(contact2 != null ? !contact2.equals(that.contact2) : that.contact2 != null);

    }

    @Override
    public int hashCode() {
        int result = contact1 != null ? contact1.hashCode() : 0;
        result = 31 * result + (contact2 != null ? contact2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FriendShip{" +
                "contact1=" + contact1 +
                ", contact2=" + contact2 +
                '}';
    }
}
