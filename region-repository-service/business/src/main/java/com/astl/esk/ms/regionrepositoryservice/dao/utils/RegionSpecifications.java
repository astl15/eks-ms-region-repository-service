package com.astl.esk.ms.regionrepositoryservice.dao.utils;

import javax.persistence.criteria.Join;

import org.springframework.data.jpa.domain.Specification;

import com.astl.esk.ms.regionrepositoryservice.entity.Country;
import com.astl.esk.ms.regionrepositoryservice.entity.Region;

public class RegionSpecifications {
	
	public static Specification<Region> getRegionsByCountryShortName(final String countryShortName) {
		return (root, query, criteriaBuilder) -> {
            Join<Region, Country> countryJoin = root.join("country");
            return criteriaBuilder.equal(countryJoin.get("countryShortName"), countryShortName);
        };
	} 

}
