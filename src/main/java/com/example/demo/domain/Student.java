package com.example.demo.domain;

import java.util.UUID;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    public UUID id;
     public String name;

}
