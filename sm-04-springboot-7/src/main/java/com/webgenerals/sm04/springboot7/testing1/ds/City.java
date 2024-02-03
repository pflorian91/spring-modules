package com.webgenerals.sm04.springboot7.testing1.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
public class City {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	public City() {
	}
}
