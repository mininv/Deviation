package ru.od.deviation_control.services.repositories;
import ru.od.deviation_control.services.domain.User;
import ru.od.deviation_control.services.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastNameStartsWithIgnoreCase(String lastName);
    List<User> findByContact(String contact);
    List<User> findByUserRole(UserRole userRole);
    List<User> findByEmail(String email);
    List<User> findByEmailAndPasswordHash(String email,String passwordHash);

}

