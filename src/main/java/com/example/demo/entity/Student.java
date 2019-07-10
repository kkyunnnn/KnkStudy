package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
