package com.example.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.PersonJdbcDAO;

// @SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users --> {}", dao.findAll());
		logger.info("User ID 2 --> {}", dao.findById(2));
		logger.info("Delete User ID 2 --> {}", dao.deleteById(2));
		logger.info("inserting user --> {}", dao.insert(new Person(3,"alka","pune", new Date())));
		logger.info("update user --> {}", dao.update(new Person(1,"jeevan","hyd", new Date())));
	}

}
