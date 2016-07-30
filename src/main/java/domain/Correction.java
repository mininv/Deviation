package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Correction {
    @Id
    @GeneratedValue
    private Long id;

    public Correction() {
    }

    public Correction(Deviation devForCorrect, User correctUser) {
        this.deviation = devForCorrect;
        this.correctionUser = correctUser;
    }

    private User correctionUser;

    private String correctionDescription;

    private Deviation deviation;

    private Date dateOfCorrection = new Date();//дата добавления инф.

    private Date dateOfWorkOnDeviation;// дата работ произведенных по устранению

    private boolean closesDeviation;

    private boolean hasHistory;

    //

    private boolean deleted;

    private long rootID;//параметр для создание дерева истории отклонения

    private Correction replacedValue;//возвращает ссылку на исходник

    //


    public Date getDateOfWorkOnDeviation() {
        return dateOfWorkOnDeviation;
    }

    public void setDateOfWorkOnDeviation(Date dateOfWorkOnDeviation) {
        this.dateOfWorkOnDeviation = dateOfWorkOnDeviation;
    }

    public boolean isClosesDeviation() {
        return closesDeviation;
    }

    public void setClosesDeviation(boolean closesDeviation) {
        this.closesDeviation = closesDeviation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCorrectionUser() {
        return correctionUser;
    }

    public void setCorrectionUser(User correctionUser) {
        this.correctionUser = correctionUser;
    }

    public Deviation getDeviation() {
        return deviation;
    }

    public void setDeviation(Deviation deviation) {
        this.deviation = deviation;
    }

    public Date getDateOfCorrection() {
        return dateOfCorrection;
    }

    public void setDateOfCorrection(Date dateOfCorrection) {
        this.dateOfCorrection = dateOfCorrection;
    }

    public String getCorrectionDescription() {
        return correctionDescription;
    }

    public void setCorrectionDescription(String correctionDescription) {
        this.correctionDescription = correctionDescription;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public long getRootID() {
        return rootID;
    }

    public void setRootID(long rootID) {
        this.rootID = rootID;
    }

    public Correction getReplacedValue() {
        return replacedValue;
    }

    public void setReplacedValue(Correction replacedValue) {
        this.replacedValue = replacedValue;
    }

    public boolean isHasHistory() {
        return hasHistory;
    }

    public void setHasHistory(boolean hasHistory) {
        this.hasHistory = hasHistory;
    }

    @Override
    public String toString() {
        return "Correction{" +
                "id=" + id +
                ", correctionUser=" + correctionUser +
                ", correctionDescription='" + correctionDescription + '\'' +
                ", deviation=" + deviation +
                ", dateOfCorrection=" + dateOfCorrection +
                ", dateOfWorkOnDeviation=" + dateOfWorkOnDeviation +
                ", closesDeviation=" + closesDeviation +
                ", deleted=" + deleted +
                ", rootID=" + rootID +
                ", replacedValue=" + replacedValue +
                '}';
    }
}
