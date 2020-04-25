package com.astl.esk.ms.regionrepositoryservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REGIONS")
public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REGION_ID")
	private Long regionId;
	
	@Column(name = "REGION_NAME")
	private String regionName;
	
	@Column(name = "REGION_SHORT_NAME")
	private String regionShortName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGION_COUNTRY_ID")
	private Country country;

	private Region() {}
	
	private Region(final String regionName, final String regionShortName, final Country country) {
		this.regionName = regionName;
		this.regionShortName = regionShortName;
		this.country = country;
	}

	public Long getRegionId() {
		return regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public String getRegionShortName() {
		return regionShortName;
	}
	
	public Country getCountry() {
		return country;
	}

	public static class RegionBuilder {
		
		private String regionName;
		
		private String regionShortName;
		
		private Country country;
		
		public RegionBuilder addRegionName(final String regionName) {
			this.regionName = regionName;
			return this;
		}
		
		public RegionBuilder addRegionShortName(final String regionShortName) {
			this.regionShortName = regionShortName;
			return this;
		}
		
		public RegionBuilder addRegionCountry(final Country country) {
			this.country =  country;
			return this;
		}
		
		public Region build() {
			return new Region(this.regionName, this.regionShortName, this.country);
		}
		
	}

}
