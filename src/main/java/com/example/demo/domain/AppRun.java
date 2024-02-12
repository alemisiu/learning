package com.example.demo.domain;

import java.util.ArrayList;
import java.util.UUID;

import javax.persistence.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRun implements ApplicationRunner {

    private static Logger log = LoggerFactory.getLogger(AppRun.class);

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SchoolClassRepository klasaRepository;
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student student1 = new Student();
        student1.name = " wiktor jakiśtam";
        student1.id = UUID.randomUUID();
        studentRepository.save(student1);

        SchoolClass klasa = new SchoolClass();
        klasa.name = "1a";
        klasa.id = UUID.randomUUID();
        klasa.students = new ArrayList<>();

        klasa.students.add(student1);
        klasaRepository.save(klasa);

        Student student2 = new Student();
        student2.name = "maciej zawiedziuj";
        student2.id = UUID.randomUUID();
        studentRepository.save(student2);

        klasa.students.add(student2);
        klasaRepository.save(klasa);
        log.info("sparta {}", klasa.students);

        Teacher teacher1 = new Teacher();
        teacher1.name = "Jan Kowalski";
        teacher1.id = UUID.randomUUID();
        teacher1.wychowawca = klasa;
        teacherRepository.save(teacher1);

        long count = studentRepository.count();
        log.info("ilosc studentow {}", count);

    }

}
