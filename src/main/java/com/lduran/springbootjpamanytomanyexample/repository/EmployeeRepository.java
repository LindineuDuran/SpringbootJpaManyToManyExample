package com.lduran.springbootjpamanytomanyexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lduran.springbootjpamanytomanyexample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
