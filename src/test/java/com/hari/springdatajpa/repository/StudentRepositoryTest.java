package com.hari.springdatajpa.repository;

import com.hari.springdatajpa.entity.Guardian;
import com.hari.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    public void saveStudent(){
//        Student student=Student.builder()
//                .emailId("hareesha64@gmail.com")
//                .firstName("Hareesha")
//                .lastName("Balarajappa Gari")
////                .guardianName("Balarajappa")
////                .guardianEmail("appa@gmail.com")
////                .guardianMobile("7032958377")
//                .build();
//        studentRepository.save(student);
//    }

@Test
    public void saveStudentwithGuardian(){
        Guardian guardian=Guardian.builder()
                        .email("Nikhil@Gmail.com")
                                .name("Nikhil")
                                        .mobile("7995167610")
                .build();




        Student student=Student.builder()
                .firstName("Appa")
                .emailId("appa@gmail.com")
                .lastName("Amma")
                .guardian(guardian)
        .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println("Student List"+ studentList);
    }


}