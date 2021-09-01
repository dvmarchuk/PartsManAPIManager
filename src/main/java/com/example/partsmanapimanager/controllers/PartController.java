package com.example.partsmanapimanager.controllers;

import com.example.partsmanapimanager.DAO.PartDAO;
import com.example.partsmanapimanager.models.Part;
import com.example.partsmanapimanager.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor //remove the need for constructors
@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class PartController {
    private PartDAO partDAO;

    @PostMapping("/addPart")
    public void addPart(@RequestBody Part part){
        partDAO.save(part);
    }

    @GetMapping("/getPart/{id}")
    public Part getPart(@PathVariable int id){
        return partDAO.findById(id).get();
    }
}


