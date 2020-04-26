package com.astl.esk.ms.regionrepositoryservice.mapper;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.astl.esk.ms.regionrepositoryservice.entity.Country;
import com.astl.esk.ms.regionrepositoryservice.model.dto.CountryDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;

public class CountryMapper {

private CountryMapper() {}
	
	public static Country mapFrom(CountryIn countryIn) {
		return new Country.CountryBuilder()
				.addCountryName(countryIn.getCountryName())
				.addCountryShortName(countryIn.getCountryShortName())
				.build();
	}
	
	public static CountryDTO mapFrom(Country country) {
		if(country != null) {
			return new CountryDTO(country.getCountryId(), 
					country.getCountryName(), country.getCountryShortName());
		}
		return null;
	}
	
	public static List<CountryDTO> mapFrom(List<Country> input) {
		
		return Optional.ofNullable(input)
				.orElse(Collections.emptyList())
				.stream()
				.map(in -> mapFrom(in))
				.collect(Collectors.toList());
	}
}
