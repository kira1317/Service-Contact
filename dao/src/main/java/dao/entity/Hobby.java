package dao.entity;

import javax.persistence.*;

@Entity
@Table(name="HOBBY")
public class Hobby {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "HOBBY_ID")
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
    return "Hobby{" +
            "title='" + title + '\'' +
            ", description='" + description + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Hobby hobby = (Hobby) o;

    if (title != null ? !title.equals(hobby.title) : hobby.title != null) return false;
    return !(description != null ? !description.equals(hobby.description) : hobby.description != null);

  }

  @Override
  public int hashCode() {
    int result = title != null ? title.hashCode() : 0;
    result = 31 * result + (description != null ? description.hashCode() : 0);
    return result;
  }
}
