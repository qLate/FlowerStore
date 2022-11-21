package ua.qLate.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.qLate.Logic.AppUser;
import ua.qLate.Repositories.FlowerRepository;
import ua.qLate.Repositories.UserRepository;
import ua.qLate.Store.Item.Flower.Flower;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository repository;
    public UserService(UserRepository repository) {this.repository = repository;}

    public List<AppUser> getUsers() {
        return repository.findAll();
    }
    public void addUser(AppUser user) {repository.save(user);}
}
