package com.example.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Assignment;
import com.example.repository.AssignmentRepo;

@Service
public class AssignmentServiceImpl implements AssignmentService{

	@Autowired
	AssignmentRepo ar;
	
	@Override
	public Assignment createAssignment(Assignment ass) {
		return ar.save(ass);
	}

	@Override
	public Optional<Assignment> getAssignmentById(int aid) {
		Optional<Assignment> ass=ar.findById(aid);
	return ass;
	}

	@Override
	public List<Assignment> getAllAssignment() {
		return ar.findAll();
	}

	@Override
	public List<Assignment> deleteAssignmentById(int aid) {
		
		ar.deleteById(aid);
		return ar.findAll();
		
	}

	
	@Override
	public Assignment UpdateAssignment(Assignment ass) {
		Optional<Assignment> as=ar.findById(ass.getId());
		as.ifPresent(assign->{
			ass.setRowCreattionTimestamp(assign.getRowCreattionTimestamp());
		});
		if(ar.existsById(ass.getId()))
			return ar.save(ass);
		else
			return null;
	}
	

	
	}

