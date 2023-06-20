package tn.esprit.estatemarket.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.estatemarket.entities.Complaint;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.repository.ComplaintRepo;
import tn.esprit.estatemarket.repository.FeedbackRepo;
import tn.esprit.estatemarket.repository.UserRepo;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private UserRepo userRepo;
    private ComplaintRepo complaintRepo;

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
    }


    @Override
    public Set<Complaint> getAllComplaints() {
        if (complaintRepo.findAll().size() > 0) {
            return new HashSet<Complaint>(complaintRepo.findAll());
        }
        return null;
    }


}
