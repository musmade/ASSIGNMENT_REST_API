package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Assignment;

public interface AssignmentService {
	
	public Assignment createAssignment(Assignment ass);
	public Optional<Assignment> getAssignmentById(int aid);
	public List<Assignment> getAllAssignment();
	public List<Assignment> deleteAssignmentById(int aid);
	public Assignment UpdateAssignment(Assignment ass);

}
