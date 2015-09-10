/**
 * Created by Администратор on 10.09.15.
 */
public class Place {

    private String title;
    private double longitude;
    private double latitude;
    private String description;

    public Place(String description, double latitude, double longitude, String title) {
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
    }


    public double getLatitude() {
        return latitude;
    }

    public String getTitle() {
        return title;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getDescription() {
        return description;
    }



}
