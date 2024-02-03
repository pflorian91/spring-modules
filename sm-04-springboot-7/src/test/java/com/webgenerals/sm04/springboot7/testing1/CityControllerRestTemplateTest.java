package com.webgenerals.sm04.springboot7.testing1;

import com.webgenerals.sm04.springboot7.testing1.ds.Cities;
import com.webgenerals.sm04.springboot7.testing1.ds.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CityControllerRestTemplateTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldSaveCities() {
		String url = String.format("http://localhost:%d/cities", port);

		restTemplate.put(url, City.builder().name("Los Angeles").build());
		restTemplate.put(url, City.builder().name("New York").build());

		Cities cities = restTemplate.getForEntity("/cities", Cities.class).getBody();

		assertThat(cities.getCities())
				.containsOnly(
						new City(1, "Los Angeles"),
						new City(2, "New York")
				);
	}
}
