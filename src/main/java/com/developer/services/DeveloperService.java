package com.developer.services;

import java.util.List;
import java.util.Optional;

import com.developer.entities.Developer;

public interface DeveloperService {
    Developer addDeveloper(Developer dev);
	List<Developer> getAllDevelopers();
	Optional<Developer> getDeveloper(int devId);
	Developer editDeveloper(Developer dev);
}
