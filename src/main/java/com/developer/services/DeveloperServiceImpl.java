package com.developer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.developer.entities.Developer;
import com.developer.repository.DeveloperRepository;

@Service
class DeveloperServiceImpl implements DeveloperService {
private final DeveloperRepository developerrepository ;


public DeveloperServiceImpl(DeveloperRepository developerrepository) {
	super();
	this.developerrepository = developerrepository;
}

public Developer  addDeveloper(Developer developer){
    getDeveloperRepository().save(developer);
    return developer;
    
}

public List<Developer> getAllDevelopers(){
    return getDeveloperRepository().findAll();
}
public Optional<Developer> getDeveloper(int devId)
{
	Optional<Developer> retreiveddev=getDeveloperRepository().findById(devId);
	return retreiveddev;
}

public Developer editDeveloper(Developer developer)
{
	getDeveloperRepository().save(developer);
	return developer;
}
public 	DeveloperRepository getDeveloperRepository() {
    return developerrepository;
}
}
