package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
    public class Deviation {
    @Id
    @GeneratedValue
    private Long id;

    public Deviation() {
    }

    public Deviation(User creationByWho, String description) {
        this.creationUser = creationByWho;
        this.description = description;
    }

    private String description;

    private String placeOfAppear;

    private Date appearsDate;

    private Date creationDate = new Date();

    private User creationUser;

    //
    private boolean deleted;

    private long rootID;//параметр для создание дерева истории отклонения

    private Deviation replacedValue;//возвращает ссылку на исходник
    //

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getAppearsDate() {
        return appearsDate;
    }

    public void setAppearsDate(Date appearsDate) {
        this.appearsDate = appearsDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPlaceOfAppear() {
        return placeOfAppear;
    }

    public void setPlaceOfAppear(String placeOfAppear) {
        this.placeOfAppear = placeOfAppear;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Deviation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", placeOfAppear='" + placeOfAppear + '\'' +
                ", appearsDate=" + appearsDate +
                ", creationDate=" + creationDate +
                ", creationUser=" + creationUser +
                ", deleted=" + deleted +
                ", rootID=" + rootID +
                ", replacedValue=" + replacedValue +
                '}';
    }
}
