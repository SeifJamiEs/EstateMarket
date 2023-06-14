package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
