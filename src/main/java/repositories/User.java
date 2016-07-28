package repositories;
import domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface User extends JpaRepository<User, Long> {

    List<User> findByLastNameStartsWithIgnoreCase(String lastName);

    List<User> findByContact(String contact);

    List<User> findByUserRole(UserRole userRole);

}

