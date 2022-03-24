package com.microsoft.businessbootstraper.repository;

import com.microsoft.businessbootstraper.models.PluginsMeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PluginsMetaRepository extends CrudRepository<PluginsMeta, Long> {

}