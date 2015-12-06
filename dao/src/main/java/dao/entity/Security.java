package dao.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Администратор on 01.12.15.
 */
@Entity
@Table(name = "SECURITY")
public class Security {

    @Id
    @Column(name = "SECURITY_ID")
    private int idContact;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASS")
    private String pass;

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Security{" +
                "idContact=" + idContact +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Security security = (Security) o;

        if (idContact != security.idContact) return false;
        if (login != null ? !login.equals(security.login) : security.login != null) return false;
        return !(pass != null ? !pass.equals(security.pass) : security.pass != null);

    }

    @Override
    public int hashCode() {
        int result = idContact;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }
}
