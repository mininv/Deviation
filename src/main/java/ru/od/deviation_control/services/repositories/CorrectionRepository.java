package ru.od.deviation_control.services.repositories;

import ru.od.deviation_control.services.domain.Correction;
import ru.od.deviation_control.services.domain.Deviation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface CorrectionRepository  extends JpaRepository<Correction, Long> {


    List<Correction> findByDateOfCorrection(Date dateOfCorrection);

    List<Correction> findByDeviation(Deviation deviation);

    List<Correction> findByHasHistory(Correction correction);

}

