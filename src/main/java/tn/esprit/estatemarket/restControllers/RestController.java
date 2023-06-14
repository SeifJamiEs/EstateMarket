package tn.esprit.estatemarket.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.services.IService;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private IService iService;

    @PostMapping("/ajouterUser")
    public void ajouterUser(@RequestBody User user) {
        iService.ajouterUser(user);
    }
}
