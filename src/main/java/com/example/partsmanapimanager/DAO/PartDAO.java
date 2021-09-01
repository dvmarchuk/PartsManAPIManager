package com.example.partsmanapimanager.DAO;

import com.example.partsmanapimanager.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartDAO extends JpaRepository<Part, Integer> {
}
