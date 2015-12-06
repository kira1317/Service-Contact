package core.model;

import java.io.Serializable;

/**
 * Created by ������������� on 10.09.15.
 */
public class PlaceDto implements Serializable {


    private int idPlace;
    private String title;
    private String description;

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    @Override
    public String toString() {
        return "PlaceDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceDto placeDto = (PlaceDto) o;

        if (title != null ? !title.equals(placeDto.title) : placeDto.title != null) return false;
        return !(description != null ? !description.equals(placeDto.description) : placeDto.description != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
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
}
