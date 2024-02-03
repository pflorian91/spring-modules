package com.webgenerals.sm04.springboot7.testing1.dao;

import com.webgenerals.sm04.springboot7.testing1.ds.City;
import org.springframework.data.repository.CrudRepository;

public interface CityDao extends CrudRepository<City, Integer> {
}
