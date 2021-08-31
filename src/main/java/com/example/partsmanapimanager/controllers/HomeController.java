package com.example.partsmanapimanager.controllers;

import com.example.partsmanapimanager.DAO.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor //remove the need for constructors
@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "welcome home at /";
    }

    @PostMapping("/find")
    public String find(){
        return "find part";
    }
}
