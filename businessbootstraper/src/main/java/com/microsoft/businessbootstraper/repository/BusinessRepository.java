package com.microsoft.businessbootstraper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microsoft.businessbootstraper.models.Business;

@Repository
public interface BusinessRepository extends CrudRepository<Business, Long> {


}
