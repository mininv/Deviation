package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
    public class Deviation {
        @Id
        @GeneratedValue
        private long id;

        public Deviation(User creationByWho, String description) {
            this.creationUser = creationByWho;
            this.description = description;
        }

        private String description;

        public String authorOfDeviation;

        private String spotFixing;

        private Data date;

        public long rootID;//параметр для создание дерева истории отклонения

        public Deviation replacedValue;//возвращает ссылку на исходник

        public User creationUser;

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuthorOfDeviation() {
            return authorOfDeviation;
        }

        public void setAuthorOfDeviation(String authorOfDeviation) {
            this.authorOfDeviation = authorOfDeviation;
        }

        public String getSpotFixing() {
            return spotFixing;
        }

        public void setSpotFixing(String spotFixing) {
            this.spotFixing = spotFixing;
        }

        public Data getDate() {
            return date;
        }

        public void setDate(Data date) {
            this.date = date;
        }

        public long getRootID() {
            return rootID;
        }

        public void setRootID(long rootID) {
            this.rootID = rootID;
        }

        public Deviation getReplacedValue() {
            return replacedValue;
        }

        public void setReplacedValue(Deviation replacedValue) {
            this.replacedValue = replacedValue;
        }

        public User getCreationUser() {
            return creationUser;
        }

        public void setCreationUser(User creationUser) {
            this.creationUser = creationUser;
        }

        @Override
        public String toString() {
            return "Deviation{" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    ", authorOfDeviation='" + authorOfDeviation + '\'' +
                    ", spotFixing='" + spotFixing + '\'' +
                    ", date=" + date +
                    '}';
        }
}
