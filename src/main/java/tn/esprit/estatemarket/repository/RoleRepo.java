package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
