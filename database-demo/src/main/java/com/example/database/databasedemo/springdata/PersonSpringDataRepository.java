package com.example.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{
	
}
