package com.example.partsmanapimanager.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Entity - Entity does not have primary key
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int user_id;
        private String name;

}
