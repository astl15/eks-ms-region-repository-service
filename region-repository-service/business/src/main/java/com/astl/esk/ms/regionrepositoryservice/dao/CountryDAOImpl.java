package com.astl.esk.ms.regionrepositoryservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.astl.esk.ms.regionrepositoryservice.entity.Country;

@Component
public class CountryDAOImpl implements CountryDAO{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country createCountry(final Country country) {
		return countryRepository.save(country);
	}

	@Override
	public Country findCountryByShortName(final String countryShortName) {
		return countryRepository.findByCountryShortName(countryShortName);
	}

	@Override
	public Page<Country> searchCountries(int pageNumber, int nrOfResultsPerPage) {
		Pageable pageable = PageRequest.of(pageNumber, nrOfResultsPerPage);
		return countryRepository.findAll(pageable);
	}

}
