package com.astl.esk.ms.regionrepositoryservice.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.astl.esk.ms.regionrepositoryservice.dao.CountryDAO;
import com.astl.esk.ms.regionrepositoryservice.entity.Country;
import com.astl.esk.ms.regionrepositoryservice.mapper.CountryMapper;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;
import com.astl.esk.ms.regionrepositoryservice.validator.CountryValidator;

@Component
public class CountryManager {
	
	@Autowired
	private CountryDAO countryDao;

	public CountryManager() {}
	
	public Country createCountry(final CountryIn countryIn) {
		CountryValidator.validateInput(countryIn);
		Country country = CountryMapper.mapFrom(countryIn);
		return countryDao.createCountry(country);
	}
	
	public Country findCountryByShortName(final String shortName) {
		return countryDao.findCountryByShortName(shortName);
	}
	
	public Page<Country> searchCountries(final int pageNumber, final int nrOfResultsPerPage) {
		return countryDao.searchCountries(pageNumber, nrOfResultsPerPage);
	}
}
