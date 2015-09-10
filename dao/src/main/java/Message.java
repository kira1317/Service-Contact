import java.time.LocalDateTime;

/**
 * Created by Администратор on 10.09.15.
 */
public class Message {

    private LocalDateTime date;
    private Contact from;
    private Contact to;
    private String content;


    public Message(Contact to, Contact from, LocalDateTime date, String content) {
        this.to = to;
        this.from = from;
        this.date = date;
        this.content = content;
    }

    public Contact getFrom() {
        return from;
    }

    public Contact getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }



}
