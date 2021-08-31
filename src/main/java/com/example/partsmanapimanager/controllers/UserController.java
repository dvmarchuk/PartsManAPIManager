package com.example.partsmanapimanager.controllers;

import com.example.partsmanapimanager.DAO.UserDAO;
import com.example.partsmanapimanager.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor //remove the need for constructors
@RestController
public class UserController {
    private UserDAO userDAO;// inits userDAO for DB saving

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> allUsers = userDAO.findAll();
        return allUsers;
    }

    @PostMapping("/users")
    public void postUsers(){
        User s = new User();
        s.setUserName("dmarchuk");
        userDAO.save(s);
    }
}
