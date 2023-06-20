package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.Profile;
import tn.esprit.estatemarket.entities.Role;

public interface ProfileRepo extends JpaRepository<Profile, Long> {
}
