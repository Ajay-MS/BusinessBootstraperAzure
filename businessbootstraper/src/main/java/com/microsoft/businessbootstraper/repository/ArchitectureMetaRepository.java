package com.microsoft.businessbootstraper.repository;

import com.microsoft.businessbootstraper.models.ArchitectureMeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchitectureMetaRepository extends CrudRepository<ArchitectureMeta, Long> {

}
