package com.microsoft.businessbootstraper.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.microsoft.businessbootstraper.repository.BusinessProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.businessbootstraper.models.*;
import com.microsoft.businessbootstraper.repository.BusinessRepository;

@RestController
@RequestMapping("/business-profile")
public class BusinessProfileController {

    @Autowired
    private BusinessProfileRepository repository;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Welcome to the Azure Business Bootstrapper!");
    }

    @GetMapping("/api/{id}/scale/{scale}")
    public ResponseEntity<BusinessProfile> scale(@PathVariable(value = "id") long id, @PathVariable(value = "scale") int scale)
    {
        Optional<BusinessProfile> optionalProfile = repository.findById(id);
        if(optionalProfile.isPresent())
        {
            var profile = optionalProfile.get();
            profile.setScale(scale);
            var finalProfile =  repository.save(profile);
            return ResponseEntity.ok().body(finalProfile);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/api")
    public List<BusinessProfile> findAllProfiles() {
        //TODO: implement
        return Collections.emptyList();
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<BusinessProfile> findProfileById(@PathVariable(value = "id") long id) {
        Optional<BusinessProfile> profile = repository.findById(id);

        if(profile.isPresent()) {
            return ResponseEntity.ok().body(profile.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public BusinessProfile saveProfile(@Validated @RequestBody BusinessProfile profile) {
        return repository.save(profile);
    }
}
