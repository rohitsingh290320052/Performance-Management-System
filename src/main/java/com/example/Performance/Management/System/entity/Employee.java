package com.example.Performance.Management.System.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Goal> goals;

    // Getters and Setters
}
