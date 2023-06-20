package tn.esprit.estatemarket.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.services.IService;

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

}
