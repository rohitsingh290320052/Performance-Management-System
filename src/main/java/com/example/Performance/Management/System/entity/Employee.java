package com.example.Performance.Management.System.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employees") // Specify the collection name
public class Employee {
    @Id
    private String id; // MongoDB's default ID type is String
    private String name;
    private String designation;
    private double salary;
}
