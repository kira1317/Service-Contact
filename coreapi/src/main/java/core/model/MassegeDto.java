package core.model;

import java.util.Date;

/**
 * Created by Администратор on 02.12.15.
 */
public class MassegeDto{


        private int idMasseger;
        private int from;
        private ContactDto to;
        private String content;
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

        public String getContent() {
                return content;
        }

        public void setContent(String content) {
                this.content = content;
        }

        public ContactDto getTo() {
                return to;
        }

        public void setTo(ContactDto to) {
                this.to = to;
        }

        public Date getDateMassege() {
                return dateMassege;
        }

        public void setDateMassege(Date dateMassege) {
                this.dateMassege = dateMassege;
        }

        @Override
        public String toString() {
                return "MassegeDto{" +
                        "idMasseger=" + idMasseger +
                        ", from=" + from +
                        ", to=" + to +
                        ", content='" + content + '\'' +
                        ", dateMassege=" + dateMassege +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                MassegeDto that = (MassegeDto) o;

                if (idMasseger != that.idMasseger) return false;
                if (from != that.from) return false;
                if (to != null ? !to.equals(that.to) : that.to != null) return false;
                if (content != null ? !content.equals(that.content) : that.content != null) return false;
                return !(dateMassege != null ? !dateMassege.equals(that.dateMassege) : that.dateMassege != null);

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
