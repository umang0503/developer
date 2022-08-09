package com.developer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.developer.entities.Developer;
import com.developer.services.DeveloperService;
@RestController
public class DeveloperRestController {
private final DeveloperService developerservice;

public DeveloperRestController(DeveloperService developerservice) {
	super();
	this.developerservice = developerservice;
}
@PostMapping("/developer")
public ResponseEntity<Developer> createPost(@RequestBody Developer developer){
    developerservice.addDeveloper(developer);
    return new ResponseEntity<>(developer,HttpStatus.CREATED);
}

@GetMapping("/developer")
public ResponseEntity<List<Developer>> getAllPosts(){
    return new ResponseEntity<>(developerservice.getAllDevelopers(), HttpStatus.OK);
}

}
