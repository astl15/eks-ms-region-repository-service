package com.astl.esk.ms.regionrepositoryservice.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.astl.esk.ms.regionrepositoryservice.api.intf.CountryService;
import com.astl.esk.ms.regionrepositoryservice.business.entity.Country;
import com.astl.esk.ms.regionrepositoryservice.business.manager.CountryManager;
import com.astl.esk.ms.regionrepositoryservice.business.mapper.CountryMapper;
import com.astl.esk.ms.regionrepositoryservice.model.dto.CountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.dto.SearchCountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;

@Component
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryManager countryManager;

	@Override
	public CountryDTO createCountry(final CountryIn countryIn) {
		return CountryMapper.mapFrom(countryManager.createCountry(countryIn));
	}

	@Override
	public SearchCountryDTO searchCountries(final int pageNumber, final int nrOfResultsPerPage) {
		SearchCountryDTO output = new SearchCountryDTO();
		Page<Country> page = countryManager.searchCountries(pageNumber, nrOfResultsPerPage);
		if(page != null && page.hasContent()) {
			output.setCountries(CountryMapper.mapFrom(page.getContent()));
			output.setTotalElements(page.getTotalPages() * nrOfResultsPerPage);
		}
		return output;
	}

}
