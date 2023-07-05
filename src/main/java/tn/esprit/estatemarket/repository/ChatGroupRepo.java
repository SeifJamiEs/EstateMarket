package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.ChatGroup;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;

public interface ChatGroupRepo extends JpaRepository<ChatGroup, Long> {
    Set<ChatGroup> findAllByUser(User user);

}
