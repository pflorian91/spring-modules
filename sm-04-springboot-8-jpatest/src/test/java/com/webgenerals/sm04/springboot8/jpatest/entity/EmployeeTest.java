package com.webgenerals.sm04.springboot8.jpatest.entity;

import com.webgenerals.sm04.springboot8.jpatest.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeTest {

	private static final Employee EMPLOYEE_1 = new Employee(1, "John", "Doe", "John.Doe@corp.com");
	private static final Employee EMPLOYEE_2 = new Employee(2, "Dave", "Doyle", "Dave.Doyle@corp.com");

	@Autowired
	private TestEntityManager testEntityManager;

	@Test
	public void shouldStoreEmployeeAndFindById() {
		testEntityManager.merge(EMPLOYEE_1);
		testEntityManager.merge(EMPLOYEE_2);

		assertEquals(EMPLOYEE_1, testEntityManager.find(Employee.class, 1));
		assertEquals(EMPLOYEE_2, testEntityManager.find(Employee.class, 2));
	}
}