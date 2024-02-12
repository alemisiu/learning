package com.example.demo.domain;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SchoolClass {
    @Id
    UUID id;

    @OneToOne
    Teacher wychowawca;

    @OneToMany
    public List<Student> students;

    public String name;
    

    
}
