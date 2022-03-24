package com.microsoft.businessbootstraper.repository;

import com.microsoft.businessbootstraper.models.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {

}
