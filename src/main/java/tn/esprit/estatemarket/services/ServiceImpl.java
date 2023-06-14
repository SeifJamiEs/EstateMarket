package tn.esprit.estatemarket.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.estatemarket.entities.User;
import tn.esprit.estatemarket.repository.UserRepo;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private UserRepo userRepo;
    @Override
    public void ajouterUser(User user) {
        userRepo.save(user);
    }
}
