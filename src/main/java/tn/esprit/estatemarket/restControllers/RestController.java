package tn.esprit.estatemarket.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.Role;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.services.IService;

import java.util.Set;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private IService iService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        iService.addUser(user);
    }
    @PostMapping("/addProfile")
    public void addProfile(@RequestBody User user) {
        iService.addProfile(user);
    }
    @PostMapping("/addRole")
    public void addRole(@RequestBody Role role) {
        iService.addRole(role);
    }
    @PostMapping("/addFeedback")
    public void addFeedback(@RequestBody Feedback feedback) {
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
    @PostMapping("/deleteProfile/{id}")
    public void deleteProfile(@PathVariable("id") Long id) {
        iService.deleteProfile(id);
    }
    @PostMapping("/deleteRole/{id}")
    public void deleteRole(@PathVariable("id") Long id) {
        iService.deleteRole(id);
    }
    @PostMapping("/deleteUser/{user}")
    public void deleteUser(@PathVariable("user") User user) {
        iService.deleteUser(user);
    }
    @PostMapping("/updateFeedback")
    public void updateFeedback(@RequestBody Feedback feedback) {
        iService.updateFeedback(feedback);
    }
    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody User user) {
        iService.updateProfile(user);
    }
    @PostMapping("/updateRole")
    public void updateRole(@RequestBody Role role) {
        iService.updateRole(role);
    }
    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        iService.updateUser(user);
    }
}
}
