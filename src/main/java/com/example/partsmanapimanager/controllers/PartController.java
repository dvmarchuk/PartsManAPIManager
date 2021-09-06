package com.example.partsmanapimanager.controllers;

import com.example.partsmanapimanager.DAO.PartDAO;
import com.example.partsmanapimanager.models.Part;
import com.example.partsmanapimanager.models.User;
import com.example.partsmanapimanager.services.PartService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/parts") //this will set a base URL
@AllArgsConstructor //remove the need for constructors
@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class PartController {
    private PartService partService;



    @GetMapping("/all")
    public ResponseEntity<List<Part>> getAllParts(){
        List<Part> parts = partService.findAllParts();
        return new ResponseEntity<>(parts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Part> getPartById(@PathVariable Integer id){
        Part part = partService.findPartById(id);
        return new ResponseEntity<>(part, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Part> addPart(@RequestBody Part part){
        Part newPart = partService.addPart(part);
        return new ResponseEntity<>(newPart, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Part> updatePart(@RequestBody Part part){
        Part updatePart = partService.updatePart(part);
        return new ResponseEntity<>(updatePart, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deletePart (@PathVariable Integer id){
            partService.deletePart(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }

}


