package core.model;

/**
 * Created by Администратор on 01.12.15.
 */
public class SecurityDto {

    private int idSecurity;
    private String login;
    private String pass;

    public int getIdSecurity() {
        return idSecurity;
    }

    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
    }

    @Override
    public String toString() {
        return "SecurityDto{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecurityDto that = (SecurityDto) o;

        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        return !(pass != null ? !pass.equals(that.pass) : that.pass != null);

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
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
}
