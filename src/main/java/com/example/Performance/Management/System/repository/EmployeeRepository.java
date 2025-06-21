package com.example.Performance.Management.System.repository;

import com.example.Performance.Management.System.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // Add custom query methods if required
}
