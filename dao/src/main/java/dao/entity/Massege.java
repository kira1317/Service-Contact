package dao.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MASSEGE")
public class Massege {

    @Id
    @Column(name = "MASSEGE_ID")
    private int id;

   /* @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "CONTACT",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "IDCONTACT1")
    )
    private Set<Contact> from;

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name = "CONTACT",
            inverseJoinColumns = @JoinColumn(name = "ID"),
            joinColumns = @JoinColumn(name = "IDCONTACT2")
    )
    private Set<Contact> to;*/


    @Column(name = "MESSAGETEXT")
    private String content;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_MASSEGE")
    private Date dateMassege;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  public Set<Contact> getTo() {
        return to;
    }

    public void setTo(Set<Contact> to) {
        this.to = to;
    }

    public Set<Contact> getFrom() {
        return from;
    }

    public void setFrom(Set<Contact> from) {
        this.from = from;
    }*/

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
                "id=" + id +
              //  ", from=" + from +
             //   ", to=" + to +
                ", content='" + content + '\'' +
                ", dateMassege=" + dateMassege +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Massege massege = (Massege) o;

        if (id != massege.id) return false;
      //  if (from != null ? !from.equals(massege.from) : massege.from != null) return false;
      //  if (to != null ? !to.equals(massege.to) : massege.to != null) return false;
        if (content != null ? !content.equals(massege.content) : massege.content != null) return false;
        return !(dateMassege != null ? !dateMassege.equals(massege.dateMassege) : massege.dateMassege != null);

    }

    @Override
    public int hashCode() {
        int result = id;
      //  result = 31 * result + (from != null ? from.hashCode() : 0);
      //  result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (dateMassege != null ? dateMassege.hashCode() : 0);
        return result;
    }
}
