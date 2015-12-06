package core.model;

import java.io.Serializable;

/**
 * Created by ������������� on 10.09.15.
 */

public class HobbyDto implements Serializable {


    private int idHobby;
    private String title;
    private String description;

    public int getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(int idHobby) {
        this.idHobby = idHobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HobbyDto hobbyDto = (HobbyDto) o;

        if (title != null ? !title.equals(hobbyDto.title) : hobbyDto.title != null) return false;
        return !(description != null ? !description.equals(hobbyDto.description) : hobbyDto.description != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HobbyDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
