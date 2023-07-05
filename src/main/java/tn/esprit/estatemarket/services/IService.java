package tn.esprit.estatemarket.services;

import tn.esprit.estatemarket.entities.ChatGroup;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Message;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;

public interface IService {
    void addUser(User user);

    void addFeedback(Feedback feedback);

    void deleteFeedback(Long id);

    void updateFeedback(Feedback feedback);

    Set<Feedback> getAllFeedbacks();

    Set<Feedback> getAllFeedbacksByUser(Long id);


    void addChat(ChatGroup chat);

    void deleteChat(Long id);

    void updateChat(ChatGroup chat);

    Set<ChatGroup> getAllChats();

    Set<ChatGroup> getAllChatsByUser(Long id);

    void addMessage(Message message);

    void deleteMessage(Long id);

    void updateMessage(Message message);

    Set<Message> getAllMessages();

    Set<Message> getAllMessagesByChatGroup(Long id);

}
