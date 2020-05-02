package com.astl.esk.ms.regionrepositoryservice.business.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRIES")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COUNTRY_ID")
	private Long countryId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "COUNTRY_SHORT_NAME")
	private String countryShortName;
	
	@OneToMany(mappedBy = "country", 
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	List<Region> countryRegions;
	
	private Country() {
		
	}

	private Country(String countryName, String countryShortName, List<Region> countryRegions) {
		this.countryName = countryName;
		this.countryShortName = countryShortName;
		this.countryRegions = countryRegions;
	}

	public Long getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCountryShortName() {
		return countryShortName;
	}

	public List<Region> getCountryRegions() {
		return countryRegions;
	}
	
	public static class CountryBuilder {
		
		private String countryName;
		
		private String countryShortName;
		
		private List<Region> regions;
		
		public CountryBuilder addCountryName(final String countryName) {
			this.countryName = countryName;
			return this;
		}
		
		public CountryBuilder addCountryShortName(final String countryShortName) {
			this.countryShortName = countryShortName;
			return this;
		}
		
		public CountryBuilder addRegions(final List<Region> regions) {
			this.regions = regions;
			return this;
		}
		
		public Country build() {
			return new Country(this.countryName, this.countryShortName, this.regions);
		}
	}

}
