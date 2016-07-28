package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Correction {
    @Id
    @GeneratedValue
    private long id;

    public Correction(Deviation devForCorrect, User correctUser) {
        this.devForCorrect = devForCorrect;
        this.correctUser = correctUser;
    }

    public User correctUser;

    public String placeOfDeviation;

    public Deviation devForCorrect;

    public Date dateOfCorrection;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getCorrectUser() {
        return correctUser;
    }

    public void setCorrectUser(User correctUser) {
        this.correctUser = correctUser;
    }

    public String getPlaceOfDeviation() {
        return placeOfDeviation;
    }

    public void setPlaceOfDeviation(String placeOfDeviation) {
        this.placeOfDeviation = placeOfDeviation;
    }

    public Deviation getDevForCorrect() {
        return devForCorrect;
    }

    public void setDevForCorrect(Deviation devForCorrect) {
        this.devForCorrect = devForCorrect;
    }

    public Date getDateOfCorrection() {
        return dateOfCorrection;
    }

    public void setDateOfCorrection(Date dateOfCorrection) {
        this.dateOfCorrection = dateOfCorrection;
    }

    @Override
    public String toString() {
        return "Correction{" +
                "id=" + id +
                ", correctUser=" + correctUser +
                ", placeOfDeviation='" + placeOfDeviation + '\'' +
                ", devForCorrect=" + devForCorrect +
                ", dateOfCorrection=" + dateOfCorrection +
                '}';
    }
}
