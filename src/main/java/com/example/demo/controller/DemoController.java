package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloWorld() {
        return "HelloWorld";
    }

    @RequestMapping("/add")
    @ResponseBody
    public boolean add() {
        return studentService.add();
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<Student> getAll() {
        return studentService.search();
    }

}
