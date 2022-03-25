package com.microsoft.businessbootstraper.controllers;

import com.microsoft.businessbootstraper.constants.BusinessTypes;
import com.microsoft.businessbootstraper.models.Business;
import com.microsoft.businessbootstraper.models.BusinessData;
import com.microsoft.businessbootstraper.models.BusinessProfile;
import com.microsoft.businessbootstraper.repository.BusinessProfileRepository;
import com.microsoft.businessbootstraper.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @GetMapping
    @RequestMapping("/business/types")
    public Map<Integer, String> GetBusinessMap() {
        return BusinessTypes.getBusinessMap();
    }
}
