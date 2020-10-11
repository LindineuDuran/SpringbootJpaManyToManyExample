package com.lduran.springbootjpamanytomanyexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lduran.springbootjpamanytomanyexample.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>
{

}
