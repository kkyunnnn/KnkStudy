package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public boolean add() {
        Student student = new Student();
        student.setId(1l);
        student.setName("nk");
        studentRepository.save(student);
        return true;
    }

    public List<Student> search() {
        return studentRepository.findAll();
    }

}
