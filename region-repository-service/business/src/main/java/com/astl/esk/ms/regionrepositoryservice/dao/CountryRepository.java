package com.astl.esk.ms.regionrepositoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.astl.esk.ms.regionrepositoryservice.entity.Country;

@Repository
@Transactional(propagation=Propagation.REQUIRED) 
public interface CountryRepository extends JpaRepository<Country, Long> {

	Country findByCountryShortName(final String countryShortName);
	
}
