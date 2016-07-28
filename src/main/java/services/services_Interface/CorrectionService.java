package services.services_Interface;

import domain.Correction;
import domain.Deviation;
import domain.User;

import java.util.List;


public interface CorrectionService {

    List<Correction> findAllCorectionsForDeviation(Deviation deviation);

    void addCorrection(Deviation deviation, Correction correction, User user);

    void removeCorrection(Correction correction, User user);

    void updateCorrection(Correction correction, User user);

    List<Correction> findCorrectionHistory(Correction correction);

    boolean hasHistory(Correction correction);

}
