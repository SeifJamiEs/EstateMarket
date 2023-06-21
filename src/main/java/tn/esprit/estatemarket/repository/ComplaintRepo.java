package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.Complaint;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;
public interface ComplaintRepo extends JpaRepository<Complaint, Long> {

    Set<Complaint> findAllByUser(User user);
}
