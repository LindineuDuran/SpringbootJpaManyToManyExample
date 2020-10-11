package com.lduran.springbootjpamanytomanyexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Enabling JPA Auditing
public class SpringbootJpaManyToManyExampleApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootJpaManyToManyExampleApplication.class, args);
	}

}
