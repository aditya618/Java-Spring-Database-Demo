package com.example.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User ID 2 --> {}", repository.findById(1002));
		repository.deleteById(1002);
		logger.info("inserting user --> {}", repository.save(new Person("alka","pune", new Date())));
		logger.info("update user --> {}", repository.save(new Person(1001,"jeevan","hyd", new Date())));
		logger.info("All users --> {}", repository.findAll());
		
	}

}
