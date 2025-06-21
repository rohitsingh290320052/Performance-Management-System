package com.example.Performance.Management.System.repository;

import com.example.Performance.Management.System.entity.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, String> {
    // Add custom query methods if required
}
