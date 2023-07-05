package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.ChatGroup;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Message;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;

public interface MessageRepo extends JpaRepository<Message, Long> {
    Set<Message> findAllByChatGroup(ChatGroup chatGroup);


}
