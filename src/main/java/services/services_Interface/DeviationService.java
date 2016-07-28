package services.services_Interface;


import domain.Deviation;

import java.util.List;

public interface DeviationService {

    void removeDeviation();

    void saveDeviation();

    void updateDeviation();

    List<Deviation> findAllDeviation();

}
