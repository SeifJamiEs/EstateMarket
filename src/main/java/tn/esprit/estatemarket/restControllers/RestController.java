package tn.esprit.estatemarket.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Offer;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.services.IService;
import tn.esprit.estatemarket.entities.Complaint;

import java.util.Set;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private IService iService;

    @PostMapping("/addUser")
    public void ajouterUser(@RequestBody User user) {
        iService.addUser(user);
    }

    @PostMapping("/addFeedback")
    public void ajouterFeedback(@RequestBody Feedback feedback) {
        iService.addFeedback(feedback);
    }

    @GetMapping("/getAllFeedbacks")
    public Set<Feedback> getAllFeedbacks() {
        return iService.getAllFeedbacks();
    }

    @GetMapping("/getAllFeedbacksByUserId/{id}")
    public Set<Feedback> getAllFeedbacksByUser(@PathVariable("id") Long id) {
        return iService.getAllFeedbacksByUser(id);
    }

    @PostMapping("/deleteFeedback/{id}")
    public void deleteFeedback(@PathVariable("id") Long id) {
        iService.deleteFeedback(id);
    }

    @PostMapping("/updateFeedback")
    public void updateFeedback(@RequestBody Feedback feedback) {
        iService.updateFeedback(feedback);
    }


    @PostMapping("/addComplaint")
    public void ajouterComplaint(@RequestBody Complaint complaint) {
        iService.addComplaint(complaint);
    }

    @GetMapping("/getAllComplaints")
    public Set<Complaint> getAllComplaints() {
        return iService.getAllComplaints();
    }


    @PostMapping("/deleteComplaint/{id}")
    public void deleteComplaint(@PathVariable("id") Long id) {
        iService.deleteComplaint(id);
    }

    @PostMapping("/updateComplaint")
    public void updateComplaint(@RequestBody Complaint complaint) {
        iService.updateComplaint(complaint);
    }
    @PostMapping("/addOffer")
    public void addOffer(@RequestBody Offer offer) {
        iService.addOffer(offer);
    }

    @GetMapping("/getAllOffers")
    public Set<Offer> getAllOffers() {
        return iService.getAllOffers();
    }

    @PostMapping("/deleteOffer/{id}")
    public void deleteOffer(@PathVariable("id") Long id) {
        iService.deleteOffer(id);
    }

    @PostMapping("/updateOffer")
    public void updateOffer(@RequestBody Offer offer) {
        iService.updateOffer(offer);
    }

}
