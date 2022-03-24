package com.microsoft.businessbootstraper.repository;

import com.microsoft.businessbootstraper.models.BusinessProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessProfileRepository extends CrudRepository<BusinessProfile, Long> {

}
