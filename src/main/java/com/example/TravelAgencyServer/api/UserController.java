package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.User;
import com.example.TravelAgencyServer.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO dodac do wszystkich entity equals hashcode itd.

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody
    int addUser(@RequestBody User user) {
        System.out.println(user);
        return userService.addUser(user);
    }

    @PostMapping(path = "/loginUser")
    public @ResponseBody
    User loginUser(@RequestParam("nick") String nick, @RequestParam("password") String password) {
        System.out.println("Received nick = " + nick + "  pass = " + password);
        return userService.loginUser(nick, password);
    }

    @GetMapping(path = "/getAllUsers")
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping(path = "/updateUser")
    public @ResponseBody
    User updateUser(@RequestBody User userToUpdate) {
        return userService.updateUser(userToUpdate);
    }

}
