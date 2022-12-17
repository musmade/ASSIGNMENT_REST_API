package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Assignment;
import com.example.service.AssignmentService;

@RestController
public class AssignmentController {

	@Autowired
	AssignmentService as;

	@PostMapping("/assignments/assignment")
	public Assignment createAssignment(@RequestBody Assignment ass) {
		return as.createAssignment(ass);
	}

	@GetMapping("/assignments/")
	public List<Assignment> getAllAssignment() {
		return as.getAllAssignment();
	}

	@DeleteMapping("/assignments/deleteassignment/{id}")
	public List<Assignment> deleteAssignment(@PathVariable("id")int aid) {
		return as.deleteAssignmentById(aid);
	}

	@PutMapping("/assignments/updateassignment/")
	public Assignment UpdateAssignment(@RequestBody Assignment ass) {
		return as.UpdateAssignment(ass);
	}

	@GetMapping("/assignments/getassignment/{id}")
	public Optional<Assignment> getAssignmentById(@PathVariable("id") int aid) {
		return as.getAssignmentById(aid);
	}


}
