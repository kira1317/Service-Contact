/**
 * Created by Администратор on 10.09.15.
 */
public class Hobby {

    private String title;
    private String description;




    public Hobby(String description, String title) {
        this.description = description;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }




}
