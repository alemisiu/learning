package com.example.demo.domain;

import java.util.UUID;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
    @Id
    UUID id;

    @OneToOne
    public SchoolClass wychowawca;
    public String name;
}
