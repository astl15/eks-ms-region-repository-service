package com.astl.esk.ms.regionrepositoryservice.api.intf;

import com.astl.esk.ms.regionrepositoryservice.model.dto.CountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.dto.SearchCountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;

public interface CountryService {

	CountryDTO createCountry(final CountryIn countryIn);
	
	SearchCountryDTO searchCountries(final int pageNumber, final int nrOfResultsPerPage);
	
}
