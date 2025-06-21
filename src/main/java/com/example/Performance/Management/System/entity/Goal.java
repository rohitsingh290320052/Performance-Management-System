package com.example.Performance.Management.System.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "goals")
public class Goal {
    @Id
    private String id;
    private String title;
    private String description;
    private String employeeId; // To associate the goal with an employee
}
