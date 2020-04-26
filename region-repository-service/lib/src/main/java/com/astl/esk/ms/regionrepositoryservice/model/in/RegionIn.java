package com.astl.esk.ms.regionrepositoryservice.model.in;

public class RegionIn {

	private String regionName;
	
	private String regionShortName;
	
	private String countryShortName;

	public RegionIn() {	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionShortName() {
		return regionShortName;
	}

	public void setRegionShortName(String regionShortName) {
		this.regionShortName = regionShortName;
	}

	public String getCountryShortName() {
		return countryShortName;
	}

	public void setCountryShortName(String countryShortName) {
		this.countryShortName = countryShortName;
	}
	
}
