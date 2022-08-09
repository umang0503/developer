package com.developer.services;

import java.util.List;

import com.developer.entities.Developer;

public interface DeveloperService {
    Developer addDeveloper(Developer dev);
	
	
	List<Developer> getAllDevelopers();
}
