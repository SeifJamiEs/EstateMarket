package tn.esprit.estatemarket.services;

import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Offer;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;

public interface IService {
    void addUser(User user);

    void addFeedback(Feedback feedback);


    void deleteFeedback(Long id);

    void updateFeedback(Feedback feedback);

    Set<Feedback> getAllFeedbacks();

    Set<Feedback> getAllFeedbacksByUser(Long id);

    void addOffer(Offer offer);

    void deleteOffer(Long id);

    void updateOffer(Offer offer);

    Set<Offer> getAllOffers();

}
