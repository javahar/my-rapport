package com.rapport.org.bank.controller;

import com.rapport.org.bank.config.BankConfiguration;
import com.rapport.org.bank.model.User;
import com.rapport.org.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;
    private BankConfiguration bankConfiguration;

    @Autowired
    public UserController(UserService userService, BankConfiguration bankConfiguration) {
        this.userService = userService;
        this.bankConfiguration = bankConfiguration;
    }

    @GetMapping("/user")
    public @ResponseBody ResponseEntity<User> getUserInfo(){
        return new ResponseEntity<User>(userService.getUser(), HttpStatus.OK);
    }

    @GetMapping("/env")
    public @ResponseBody ResponseEntity<String> getEnv(){
        return new ResponseEntity<String>(bankConfiguration.getHostName(), HttpStatus.OK);
    }
}
