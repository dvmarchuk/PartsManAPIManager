package com.example.partsmanapimanager.services;

import com.example.partsmanapimanager.DAO.PartDAO;
import com.example.partsmanapimanager.exceptions.PartNotFoundException;
import com.example.partsmanapimanager.models.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {
    private final PartDAO partDAO;

    @Autowired
    public PartService(PartDAO partDAO) {
        this.partDAO = partDAO;
    }

    //perform crud operations here
    public Part addPart(Part part){
        //part.setPartId();//can set the part ID here if it gives errors
        return partDAO.save(part);
    }

    public List<Part> findAllParts(){
        return partDAO.findAll();
    }

    public Part updatePart(Part part){
        return partDAO.save(part);
    }

    public Part findPartById(Integer id){
        return partDAO.findPartById(id)
                .orElseThrow(() -> new PartNotFoundException("Part by id " + id + " was not found"));
    }

    public void deletePart(Integer id){
        partDAO.deletePartById(id);
    }
}
