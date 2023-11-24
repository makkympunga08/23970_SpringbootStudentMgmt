package com.example.studentapp.repository;

import com.example.studentapp.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDefinitionRepo extends JpaRepository<CourseDefinition,Integer> {
}
