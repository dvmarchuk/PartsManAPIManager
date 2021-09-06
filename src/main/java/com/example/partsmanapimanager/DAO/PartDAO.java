package com.example.partsmanapimanager.DAO;

import com.example.partsmanapimanager.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PartDAO extends JpaRepository<Part, Integer> {
    void deletePartById(Integer id);

    Optional<Part> findPartById(Integer id);
}
