package com.astl.esk.ms.regionrepositoryservice.dao;

import org.springframework.data.domain.Page;

import com.astl.esk.ms.regionrepositoryservice.entity.Country;

public interface CountryDAO {

	Country createCountry(final Country country);
	
	Country findCountryByShortName(final String countryShortName);
	
	Page<Country> searchCountries(final int pageNumber, final int nrOfResultsPerPage);

}
