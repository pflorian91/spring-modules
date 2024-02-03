package com.webgenerals.sm04.springboot7.testing1;

import com.webgenerals.sm04.springboot7.testing1.controller.CityController;
import com.webgenerals.sm04.springboot7.testing1.ds.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CityControllerSpringBootTest {

	@Autowired
	private CityController cityController;

	@Test
	public void shouldSaveFewCities() {
		cityController.putCity(City.builder().name("Los Angeles").build());
		cityController.putCity(City.builder().name("New York").build());
		cityController.putCity(City.builder().name("San Francisco").build());

		assertThat(cityController.getCities().getCities())
				.containsOnly(
						new City(1, "Los Angeles"),
						new City(2, "New York"),
						new City(3, "San Francisco")
				);
	}
}