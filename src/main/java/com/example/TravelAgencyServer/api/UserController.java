package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.LoginResponse;
import com.example.TravelAgencyServer.model.User;
import com.example.TravelAgencyServer.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//TODO dodac do wszystkich entity equals hashcode itd.

@RestController
public class UserController implements Dao<User>{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/loginUser")
    public @ResponseBody
    User loginUser(@RequestParam("nick") String nick,@RequestParam("password") String password) {
        return userService.findUserByNickAndPassword(nick, password);
    }

    @Override
    @GetMapping("/getUser")
    public @ResponseBody
    Optional<User> get(@RequestBody Integer id) {
        return userService.get(id);
    }

    @Override
    @GetMapping("/getAllUsers")
    public @ResponseBody
    List<User> getAll() {
        return userService.getAll();
    }

    @Override
    @PostMapping(path = "/saveUser")
    public @ResponseBody
    int save(@RequestBody User user) {
        return userService.save(user);
    }

    @Override
    @PostMapping(path = "/updateUser")
    public @ResponseBody
    User update(@RequestBody User user) {
        return userService.update(user);
    }

    @Override
    @PostMapping(path = "/deleteUser")
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }
}
