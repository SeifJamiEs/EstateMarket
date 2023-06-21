package tn.esprit.estatemarket.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.estatemarket.entities.Complaint;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Offer;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.repository.ComplaintRepo;
import tn.esprit.estatemarket.repository.FeedbackRepo;
import tn.esprit.estatemarket.repository.UserRepo;
import tn.esprit.estatemarket.repository.OfferRepo;


import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private UserRepo userRepo;
    private ComplaintRepo complaintRepo;
    private OfferRepo offerRepo;
    private FeedbackRepo feedbackRepo;

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
    public void addComplaint(Complaint complaint) {
        complaintRepo.save(complaint);
    }

    @Override
    public void deleteComplaint(Long id) {
        complaintRepo.deleteById(id);
    }

    @Override
    public void updateComplaint(Complaint complaint) {
        complaintRepo.save(complaint);
    public void addOffer(Offer offer) {
        offerRepo.save(offer);
    }

    @Override
    public void deleteOffer(Long id) {
        offerRepo.deleteById(id);
    }

    @Override
    public void updateOffer(Offer offer) {
        offerRepo.save(offer);
    }


    @Override
    public Set<Complaint> getAllComplaints() {
        if (complaintRepo.findAll().size() > 0) {
            return new HashSet<Complaint>(complaintRepo.findAll());

    public Set<Offer> getAllOffers() {
        if (offerRepo.findAll().size() > 0) {
            return new HashSet<Offer>(offerRepo.findAll());
        }
        return null;
    }


}
