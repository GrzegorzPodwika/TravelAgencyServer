package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.LoginResponse;
import com.example.TravelAgencyServer.service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(path = "/verifyTypeOfUser")
    public @ResponseBody
    LoginResponse loginUser(@RequestParam("nick") String nick, @RequestParam("password") String password) {
        return loginService.loginUser(nick, password);
    }
}
