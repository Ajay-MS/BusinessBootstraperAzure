package com.microsoft.businessbootstraper.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.businessbootstraper.models.Profile;
import com.microsoft.businessbootstraper.repository.ProfileRepository;

@RestController
@RequestMapping("")
public class BusinessController {

	@Autowired
	private ProfileRepository repository;
	
	@GetMapping
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok().body("Welcome to the Azure Business Bootstrapper!");
	}
	
	@GetMapping("/api")
	public List<Profile> findAllProfiles() {
		//TODO: implement
		return Collections.emptyList();
	}
	
	@GetMapping("/api/{id}")
	public ResponseEntity<Profile> findProfileById(@PathVariable(value = "id") long id) {
		Optional<Profile> profile = repository.findById(id);
		
		if(profile.isPresent()) {
			return ResponseEntity.ok().body(profile.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public Profile saveProfile(@Validated @RequestBody Profile profile) {
		return repository.save(profile);
	}
}
