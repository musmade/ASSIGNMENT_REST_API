package com.example.entity;

import java.util.Date;

//import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	String name;
	String address;
	int pinCode;
	String  state;
	

	@CreationTimestamp
	@CreatedDate
	Date rowCreattionTimestamp;

	public Assignment() {
		super();
	}

	public Assignment(int id, String name, String address, int pinCode, String state, Date rowCreattionTimestamp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pinCode = pinCode;
		this.state = state;
		this.rowCreattionTimestamp = rowCreattionTimestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getRowCreattionTimestamp() {
		return rowCreattionTimestamp;
	}

	public void setRowCreattionTimestamp(Date rowCreattionTimestamp) {
		this.rowCreattionTimestamp = rowCreattionTimestamp;
	}
	

}
