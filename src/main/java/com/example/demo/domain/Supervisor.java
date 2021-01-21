package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Supervisor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long supId;
	private String first_name;
	private String last_name;
	
	@OneToMany
	private List<Employee> employees; 	
}
