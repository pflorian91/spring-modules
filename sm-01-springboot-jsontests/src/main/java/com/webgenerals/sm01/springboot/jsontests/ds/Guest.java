package com.webgenerals.sm01.springboot.jsontests.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@Entity
@Getter
@EqualsAndHashCode
@ToString
public class Guest {

	@Id
	@GeneratedValue
	private UUID id;
	private String firstName;
	private String lastName;

	@SuppressWarnings("unused")
	Guest() {
	}

	public Guest(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
