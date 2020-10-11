package com.lduran.springbootjpamanytomanyexample.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project extends AuditModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "project_id")
	@GeneratedValue
	private Long projectId;

	@Column(name = "title")
	private String title;

	@ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
	private Set<Employee> employees = new HashSet<Employee>();

	/**
	 *
	 */
	public Project()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 */
	public Project(String title)
	{
		super();
		this.title = title;
	}

	/**
	 * @return the projectId
	 */
	public Long getProjectId()
	{
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Long projectId)
	{
		this.projectId = projectId;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees()
	{
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees)
	{
		this.employees = employees;
	}

}
