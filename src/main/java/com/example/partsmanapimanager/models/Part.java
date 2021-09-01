package com.example.partsmanapimanager.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Builder
@ToString
@Data
@NoArgsConstructor
@Entity
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imgLink;
    private String name;
    private String partOptions;
}
