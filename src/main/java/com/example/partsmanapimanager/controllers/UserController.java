package com.example.partsmanapimanager.controllers;

import com.example.partsmanapimanager.DAO.UserDAO;
import com.example.partsmanapimanager.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor //remove the need for constructors
@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class UserController {
    private UserDAO userDAO;// inits userDAO for DB saving

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> allUsers = userDAO.findAll();
        return allUsers;
    }

    @GetMapping("/users/{id}")
        public User getUserById (@PathVariable int id){ //i could also use request param to do it through the URL v-1 1:07
        return userDAO.findById(id).get(); //so we dont have to get a type optional we use .get
        }

    @PostMapping("/users")
    public void postUsers(@RequestBody User user){ //this pulls the body from the post request
        System.out.println(user);
        userDAO.save(user);
    }


}
