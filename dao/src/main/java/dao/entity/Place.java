package dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "PLACE")
public class Place{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PLACE_ID")
    private int id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Place{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (title != null ? !title.equals(place.title) : place.title != null) return false;
        return !(description != null ? !description.equals(place.description) : place.description != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
