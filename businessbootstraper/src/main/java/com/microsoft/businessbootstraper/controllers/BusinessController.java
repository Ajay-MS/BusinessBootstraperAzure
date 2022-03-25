package com.microsoft.businessbootstraper.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.microsoft.businessbootstraper.repository.BusinessProfileRepository;
import org.hibernate.cfg.CreateKeySecondPass;
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
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessRepository repository;

    @Autowired
    private BusinessProfileRepository profileRepository;


    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Welcome to the Azure Business Bootstrapper!");
    }

    @GetMapping("/api")
    public List<Business> findAllProfiles() {
        var result = new ArrayList<Business>();
        for(Business b : repository.findAll())
        {
            result.add(b);
        }

        return result;
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<BusinessData> findProfileById(@PathVariable(value = "id") long id) {
        Optional<Business> profile = repository.findById(id);

        Optional<BusinessProfile> bussinessprofile = profileRepository.findById(id);

        BusinessData businessData = new BusinessData();

        if(profile.isPresent()) {
            businessData.SetFromBusiness(profile.get());
            if (bussinessprofile.isPresent()) {
                businessData.setProvisioned(true);
                businessData.SetFromBusinessProfile(bussinessprofile.get());
            }

            return ResponseEntity.ok().body(businessData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Business saveProfile(@Validated @RequestBody Business profile) {
        return repository.save(profile);
    }
}
