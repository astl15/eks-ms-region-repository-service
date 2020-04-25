package com.astl.esk.ms.regionrepositoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.astl.esk.ms.regionrepositoryservice.entity.Region;

@Repository
@Transactional(propagation=Propagation.REQUIRED) 
public interface RegionRepository extends JpaRepository<Region, Long>, JpaSpecificationExecutor<Region> {
	
	Region findByRegionShortName(String regionShortName);
	
}
