package ru.od.deviation_control.services.services_Interface;


import ru.od.deviation_control.services.domain.Deviation;
import ru.od.deviation_control.services.domain.User;

import java.util.List;

public interface DeviationService {

    void addDeviation(Deviation deviation, User user);

    void removeDeviation(Deviation deviation, User user);

    void updateDeviation(Deviation deviation, User user);

    List<Deviation> findAllDeviation();

}
