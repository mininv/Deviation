package ru.od.deviation_control.services.services_Interface;

import ru.od.deviation_control.services.domain.Correction;
import ru.od.deviation_control.services.domain.Deviation;
import ru.od.deviation_control.services.domain.User;

import java.util.List;


public interface CorrectionService {

    List<Correction> findAllCorectionsForDeviation(Deviation deviation);

    void addCorrection(Correction correction);

    void removeCorrection(Correction correction, User user);

    void updateCorrection(Correction correction, User user);

    List<Correction> findCorrectionHistory(Correction correction);

    boolean hasHistory(Correction correction);

}
