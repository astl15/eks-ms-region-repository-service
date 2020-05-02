package com.astl.esk.ms.regionrepositoryservice.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.astl.esk.ms.regionrepositoryservice.api.intf.CountryService;
import com.astl.esk.ms.regionrepositoryservice.model.dto.CountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.dto.SearchCountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;

@RestController
@RequestMapping("/v1/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(
			value = "/create",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE}, 
			method = RequestMethod.POST)
	public ResponseEntity<CountryDTO> createCountry(@RequestBody CountryIn countryIn) {
		CountryDTO country = countryService.createCountry(countryIn);
		return new ResponseEntity<CountryDTO>(country, HttpStatus.CREATED);
	}
	
	@RequestMapping(
			produces = {MediaType.APPLICATION_JSON_VALUE}, 
			method = RequestMethod.GET)
	public ResponseEntity<SearchCountryDTO> searchCountries(@RequestParam("pageNumber") final int pageNumber, 
			@RequestParam("nrOfResultsPerPage") final int nrOfResultsPerPage) {
		SearchCountryDTO result = countryService.searchCountries(pageNumber, nrOfResultsPerPage);
		return new ResponseEntity<SearchCountryDTO>(result, null, HttpStatus.OK);
	}

}
