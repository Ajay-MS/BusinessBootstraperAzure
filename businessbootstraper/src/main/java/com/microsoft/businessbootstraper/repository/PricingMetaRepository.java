package com.microsoft.businessbootstraper.repository;

import com.microsoft.businessbootstraper.models.PricingMeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingMetaRepository extends CrudRepository<PricingMeta, Long> {

}