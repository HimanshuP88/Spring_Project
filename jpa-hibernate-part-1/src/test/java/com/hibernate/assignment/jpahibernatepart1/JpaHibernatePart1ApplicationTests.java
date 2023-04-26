package com.hibernate.assignment.jpahibernatepart1;

import com.hibernate.assignment.jpahibernatepart1.Model.Employee;
import com.hibernate.assignment.jpahibernatepart1.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JpaHibernatePart1ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateUser() {
		Employee employee = new Employee();
		employee.setName("Anjali Gupta");
		employee.setAge(23);
		employee.setLocation("Delhi");

		employeeRepository.save(employee);
	}

	@Test
	public void testRead() {
		Employee employee = employeeRepository.findById(1l).orElseThrow(null);
		assertEquals("Delhi", employee.getLocation());
		System.out.println(">>>>>>>>>>>>>>>>>>>>" + employee.getName());
		System.out.println(employee);

	}


	@Test
	public void testUpdateUserById() {
		if(employeeRepository.existsById(1l)){
			Employee employee = employeeRepository.findById(1l).get();
			employee.setName("Rashi Sharma");
			employee.setAge(22);
			employee.setLocation("Delhi");

			employeeRepository.save(employee);
		}


	}

	@Test
	public void testDeleteUserById(){
		if(employeeRepository.existsById(3l)){
			Employee employee=employeeRepository.findById(3l).get();
			employeeRepository.delete(employee);
		}

	}

	@Test
	public void testCountRows(){
		Long count=employeeRepository.count();
		System.out.println("Number of rows in the given Table is :"+ count);
	}
	@Test
	public void testFindAllPaging(){
		Pageable pageable = PageRequest.of(1, 2);
		Page<Employee> page=employeeRepository.findAll(pageable);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		page.forEach(System.out::println);

	}

	@Test
	public void testFindAll(){
		employeeRepository.findAll(Sort.by("age")).forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void testFindByName(){
		List<Employee> list = employeeRepository.findByName("Karan Aggarwal");
		list.forEach(System.out::println);

	}

	@Test
	public void testFindByNameLike(){
		List<Employee> list = employeeRepository.findByNameLike("A%");
		list.forEach(System.out::println);
	}

	@Test
	public void testFindByAgeBetween(){
		List<Employee> byAgeBetween = employeeRepository.findByAgeBetween(28l, 32l);
		byAgeBetween.forEach(System.out::println);
	}
}
