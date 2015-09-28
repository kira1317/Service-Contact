package core.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Администратор on 10.09.15.
 */
public class Message implements Serializable {

    private LocalDateTime date;
    private Contact from;
    private Contact to;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (!date.equals(message.date)) return false;
        if (!from.equals(message.from)) return false;
        if (!to.equals(message.to)) return false;
        return content.equals(message.content);

    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + content.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", from=" + from +
                ", to=" + to +
                ", content='" + content + '\'' +
                '}';
    }
}
