package repositories;

import domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByViewAndAddAndConfirm(boolean view, boolean add, boolean confirm);

    List<UserRole> findByAdmin(boolean admin);

}

