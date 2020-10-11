package com.lduran.springbootjpamanytomanyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.lduran.springbootjpamanytomanyexample.model.Employee;
import com.lduran.springbootjpamanytomanyexample.model.Project;
import com.lduran.springbootjpamanytomanyexample.repository.EmployeeRepository;

@SpringBootApplication
@EnableJpaAuditing // Enabling JPA Auditing
public class SpringbootJpaManyToManyExampleApplication implements CommandLineRunner
{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception
	{

		// Create an employee
		Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Fadatare");

		// Create project1
		Project project1 = new Project();
		project1.setTitle("Employee Management System");

		// Create project2
		Project project2 = new Project();
		project2.setTitle("Content Management System");

		// employee can work on two projects, Add project references in the employee
		employee.getProjects().add(project1);
		employee.getProjects().add(project2);

		// Add employee reference in the projects
		project1.getEmployees().add(employee);
		project2.getEmployees().add(employee);

		employeeRepository.save(employee);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootJpaManyToManyExampleApplication.class, args);
	}

}
