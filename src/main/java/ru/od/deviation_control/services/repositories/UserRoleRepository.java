package ru.od.deviation_control.services.repositories;

import org.springframework.stereotype.Repository;
import ru.od.deviation_control.services.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {

    List<UserRole> findByViewAndAddAndConfirm(boolean view, boolean add, boolean confirm);
    List<UserRole> findByAdmin(boolean admin);
}

