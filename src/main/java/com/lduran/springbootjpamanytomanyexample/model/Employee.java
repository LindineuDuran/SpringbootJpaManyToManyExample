package com.lduran.springbootjpamanytomanyexample.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends AuditModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "empoyee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employees_projects", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	Set<Project> projects = new HashSet<Project>();

	/**
	 *
	 */
	public Employee()
	{
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param projects
	 */
	public Employee(String firstName, String lastName, Set<Project> projects)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.projects = projects;
	}

	/**
	 * @return the employeeId
	 */
	public long getEmployeeId()
	{
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(long employeeId)
	{
		this.employeeId = employeeId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the projects
	 */
	public Set<Project> getProjects()
	{
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(Set<Project> projects)
	{
		this.projects = projects;
	}
}
