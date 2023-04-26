package com.hibernate.assignment.jpahibernatepart1.Repository;

import com.hibernate.assignment.jpahibernatepart1.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public List<Employee> findByName(String name);

    public List<Employee> findByNameLike(String name);
    public List<Employee> findByAgeBetween(Long age1,Long age2);



}
