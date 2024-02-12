package com.example.demo.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("/")
    public Teacher helloString() {
        List<Teacher> teachers = teacherRepository.findAll();
        Teacher teacher1 = teachers.get(0);
        return  teacher1;
    }
}
