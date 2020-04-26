package com.astl.esk.ms.regionrepositoryservice.model.in;

public class SearchRegionIn {
	
private String countryShortName;
	
	private Integer pageNumber;
	
	private Integer nrOfResultsPerPage;

	public SearchRegionIn() {}

	public String getCountryShortName() {
		return countryShortName;
	}

	public void setCountryShortName(String countryShortName) {
		this.countryShortName = countryShortName;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getNrOfResultsPerPage() {
		return nrOfResultsPerPage;
	}

	public void setNrOfResultsPerPage(Integer nrOfResultsPerPage) {
		this.nrOfResultsPerPage = nrOfResultsPerPage;
	}

}
