package com.example.studentapp.repository;

import com.example.studentapp.model.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRepository extends JpaRepository<AcademicUnit,Integer> {
}
