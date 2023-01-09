package ua.qLate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.qLate.Logic.AppUser;
import ua.qLate.Services.UserService;
import ua.qLate.Store.Item.Flower.Flower;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping
    public List<AppUser> getUsers() {
        return service.getUsers();
    }
    @PostMapping
    public void addUsers(@RequestBody AppUser user) {
        service.addUser(user);
    }
}
