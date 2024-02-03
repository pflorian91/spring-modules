package com.webgenerals.sm04.springboot8.jpatest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

	@SuppressWarnings("unused")
	public Employee() {
	}
}
