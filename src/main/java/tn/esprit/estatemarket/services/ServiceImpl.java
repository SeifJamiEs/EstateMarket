package tn.esprit.estatemarket.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.estatemarket.entities.ChatGroup;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Message;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.repository.ChatGroupRepo;
import tn.esprit.estatemarket.repository.FeedbackRepo;
import tn.esprit.estatemarket.repository.MessageRepo;
import tn.esprit.estatemarket.repository.UserRepo;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private UserRepo userRepo;

    private FeedbackRepo feedbackRepo;

    private ChatGroupRepo chatGroupRepo;

    private MessageRepo messageRepo;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void addFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
    }

    @Override
    public void deleteFeedback(Long id) {
        feedbackRepo.deleteById(id);
    }

    @Override
    public void updateFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
    }


    @Override
    public Set<Feedback> getAllFeedbacks() {
        if (feedbackRepo.findAll().size() > 0) {
            return new HashSet<Feedback>(feedbackRepo.findAll());
        }
        return null;
    }

    @Override
    public Set<Feedback> getAllFeedbacksByUser(Long id) {
        if (feedbackRepo.findAllByUser(userRepo.findById(id).get()).size() > 0) {
            return new HashSet<Feedback>(feedbackRepo.findAllByUser(userRepo.findById(id).get()));
        }
        return null;
    }

    @Override
    public void addChat(ChatGroup chatGroup) {
        chatGroupRepo.save(chatGroup);
    }

    @Override
    public void deleteChat(Long id) {
        chatGroupRepo.deleteById(id);
    }

    @Override
    public void updateChat(ChatGroup chatGroup) {
        chatGroupRepo.save(chatGroup);
    }


    @Override
    public Set<ChatGroup> getAllChats() {
        if (chatGroupRepo.findAll().size() > 0) {
            return new HashSet<ChatGroup>(chatGroupRepo.findAll());
        }
        return null;
    }

    @Override
    public Set<ChatGroup> getAllChatsByUser(Long id) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return chatGroupRepo.findAllByUsersContaining(user);
        }
        return null;
    }

    @Override
    public void addMessage(Message message) {
        messageRepo.save(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepo.deleteById(id);
    }

    @Override
    public void updateMessage(Message message) {
        messageRepo.save(message);
    }


    @Override
    public Set<Message> getAllMessages() {
        if (messageRepo.findAll().size() > 0) {
            return new HashSet<Message>(messageRepo.findAll());
        }
        return null;
    }

    @Override
    public Set<Message> getAllMessagesByChatGroup(Long id) {
        if (messageRepo.findAllByChatGroup(chatGroupRepo.findById(id).get()).size() > 0) {
            return new HashSet<Message>(messageRepo.findAllByChatGroup(chatGroupRepo.findById(id).get()));
        }
        return null;
    }

}
