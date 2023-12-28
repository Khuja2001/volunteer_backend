package nassim.amonatapp.controller;

import nassim.amonatapp.model.User;
import nassim.amonatapp.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController( UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "Created Successful";
    }

}
