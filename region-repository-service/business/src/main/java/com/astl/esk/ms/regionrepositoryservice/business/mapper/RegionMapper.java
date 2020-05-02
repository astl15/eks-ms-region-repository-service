package com.astl.esk.ms.regionrepositoryservice.business.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.astl.esk.ms.regionrepositoryservice.business.entity.Region;
import com.astl.esk.ms.regionrepositoryservice.model.dto.RegionDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;

public class RegionMapper {
private RegionMapper() {}
	
	public static Region mapFrom(RegionIn regionIn) {
		return new Region.RegionBuilder()
				.addRegionName(regionIn.getRegionName())
				.addRegionShortName(regionIn.getRegionShortName())
				.build();
	}
	
	public static RegionDTO mapFrom(Region region) {
		if(region != null && region.getCountry() != null) {
			return new RegionDTO(region.getRegionId(), region.getRegionName(), region.getRegionShortName(), 
					region.getCountry().getCountryShortName());
		}
		return null;
	}
	
	public static List<RegionDTO> mapFrom(List<Region> input) {
		return Optional.ofNullable(input)
				.orElse(Collections.emptyList()).stream()
				.map(RegionMapper::mapFrom)
				.collect(Collectors.toList());
	}

}
