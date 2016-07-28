package repositories;

import domain.Correction;
import domain.Deviation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface CorrectionRepository  extends JpaRepository<Correction, Long> {

    List<Correction> findByCorrectUser(User user);

    List<Correction> findByDateOfCorrection(Date dateOfCorrection);

    List<Correction> findByDeviation(Deviation deviation);

    List<Correction> findByHasHistory(Correction correction);

}

