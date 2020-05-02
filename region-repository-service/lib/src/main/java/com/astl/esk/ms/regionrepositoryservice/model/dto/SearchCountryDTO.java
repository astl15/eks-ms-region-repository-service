package com.astl.esk.ms.regionrepositoryservice.model.dto;

import java.util.List;

public class SearchCountryDTO {

private int totalElements;
	
	private List<CountryDTO> countries;

	public SearchCountryDTO() {}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public List<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDTO> countries) {
		this.countries = countries;
	}
	
}
