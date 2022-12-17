package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

import com.example.entity.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment, Integer>{

}
