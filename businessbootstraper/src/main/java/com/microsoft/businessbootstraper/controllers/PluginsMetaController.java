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

import com.microsoft.businessbootstraper.models.*;
import com.microsoft.businessbootstraper.repository.PluginsMetaRepository;

@RestController
@RequestMapping("/plugins-meta")
public class PluginsMetaController {

    @Autowired
    private PluginsMetaRepository repository;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Welcome to the Azure Business Bootstrapper!");
    }

    @GetMapping("/api")
    public List<PluginsMeta> findAllProfiles() {
        //TODO: implement
        return Collections.emptyList();
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<PluginsMeta> findProfileById(@PathVariable(value = "id") long id) {
        Optional<PluginsMeta> profile = repository.findById(id);

        if(profile.isPresent()) {
            return ResponseEntity.ok().body(profile.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public PluginsMeta saveProfile(@Validated @RequestBody PluginsMeta profile) {
        return repository.save(profile);
    }
}
