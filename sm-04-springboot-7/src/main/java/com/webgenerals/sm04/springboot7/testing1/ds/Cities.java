package com.webgenerals.sm04.springboot7.testing1.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cities {

	private Iterable<City> cities;

	public Cities() {
	}
}
