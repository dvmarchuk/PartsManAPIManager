package com.example.partsmanapimanager.DAO;


import com.example.partsmanapimanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {

}
