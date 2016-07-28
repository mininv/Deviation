package services.services_Interface;


import domain.Correction;
import domain.Deviation;
import domain.User;

import java.util.List;

public interface DeviationService {

    void addDeviation(Deviation deviation, User user);

    void removeDeviation(Deviation deviation, User user);

    void updateDeviation(Deviation deviation, User user);

    List<Deviation> findAllDeviation();

}
