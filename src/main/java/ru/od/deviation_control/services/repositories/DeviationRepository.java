package ru.od.deviation_control.services.repositories;

import ru.od.deviation_control.services.domain.Deviation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface DeviationRepository extends JpaRepository<Deviation, Long> {

    List<Deviation> findByCreationUser(UserRepository user);

    List<Deviation> findByPlaceOfAppear (String placeOfAppear);

    List<Deviation> findByAppearsDate (Date appearsDate);

}
