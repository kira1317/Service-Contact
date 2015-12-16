package dao.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "MASSEGE")
public class Massege {

    @Id
    @Column(name = "MASSEGE_ID")
    private int idMasseger;

    @Column(name = "IDCONTACT1")
    private int from;

    @Column(name = "IDCONTACT2")
    @OneToOne(cascade={CascadeType.ALL})
    @JoinTable(
            name = "CONTACT",
            inverseJoinColumns = @JoinColumn(name = "IDCONTACT1"),
            joinColumns = @JoinColumn(name = "IDCONTACT2")
    )
    private Contact to;

    @Column(name = "MESSAGETEXT")
    private String content;

    @Column(name = "DATE_MASSEGE")
    private Date dateMassege;

    public int getIdMasseger() {
        return idMasseger;
    }

    public void setIdMasseger(int idMasseger) {
        this.idMasseger = idMasseger;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateMassege() {
        return dateMassege;
    }

    public void setDateMassege(Date dateMassege) {
        this.dateMassege = dateMassege;
    }

    @Override
    public String toString() {
        return "Massege{" +
                "idMasseger=" + idMasseger +
                ", from=" + from +
                ", to=" + to +
                ", content=" + content +
                ", dateMassege=" + dateMassege +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Massege massege = (Massege) o;

        if (idMasseger != massege.idMasseger) return false;
        if (from != massege.from) return false;
        if (to != null ? !to.equals(massege.to) : massege.to != null) return false;
        if (content != null ? !content.equals(massege.content) : massege.content != null) return false;
        return !(dateMassege != null ? !dateMassege.equals(massege.dateMassege) : massege.dateMassege != null);

    }

    @Override
    public int hashCode() {
        int result = idMasseger;
        result = 31 * result + from;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (dateMassege != null ? dateMassege.hashCode() : 0);
        return result;
    }
}
