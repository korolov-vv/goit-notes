package ua.goit.goitnotes.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.goit.goitnotes.user.model.UserRole;

import java.util.Optional;
import java.util.UUID;
@Component
public interface RoleRepository extends JpaRepository<UserRole, UUID> {
    Optional<UserRole> findByName(String name);
}
