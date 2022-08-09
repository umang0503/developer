package com.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.entities.Developer;
@Repository
public interface DeveloperRepository extends JpaRepository<Developer,Integer>{

}
