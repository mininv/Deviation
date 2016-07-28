package repositories;

import domain.Deviation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DeviationRepository extends JpaRepository<Deviation, Long> {

    List<Deviation> findByCreationUser(User user);

    List<Deviation> findByDescription(String description);

    List<Deviation> findByAuthorOfDeviation(String authorOfDeviation);

}
