package tn.esprit.estatemarket.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Role;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.repository.FeedbackRepo;
import tn.esprit.estatemarket.repository.UserRepo;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private UserRepo userRepo;

    private FeedbackRepo feedbackRepo;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public Set<User> getAllUser() {
        return null;
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
    public Set<User> getAllProfile() {
        return null;
    }

    @Override
    public Set<User> getProfileByUser(Long id) {
        return null;
    }

    @Override
    public void addProfile(User user) {

    }

    @Override
    public void deleteProfile(Long id) {

    }

    @Override
    public void updateProfile(User user) {

    }

    @Override
    public void addRole(Role role) {

    }

    @Override
    public void deleteRole(Long id) {

    }

    @Override
    public void updateRole(Role role) {

    }

    @Override
    public Set<Role> getAllRole() {
        return null;
    }

    @Override
    public Set<Role> getAllRoleByUser(Long id) {
        return null;
    }


}
