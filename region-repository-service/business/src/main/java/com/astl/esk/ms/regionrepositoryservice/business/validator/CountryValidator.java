package com.astl.esk.ms.regionrepositoryservice.business.validator;

import org.springframework.util.StringUtils;

import com.astl.esk.ms.regionrepositoryservice.business.exception.BusinessException;
import com.astl.esk.ms.regionrepositoryservice.business.validator.utils.ErrorCodes;
import com.astl.esk.ms.regionrepositoryservice.model.in.CountryIn;

public class CountryValidator {

	private CountryValidator() {}
	
	public static void validateInput(final CountryIn input) {
		if(input != null && (StringUtils.isEmpty(input.getCountryName()) || StringUtils.isEmpty(input.getCountryShortName()))) {
			throw new BusinessException(ErrorCodes.INPUT_002, "CountryIn has invalid format");
		}else if(input == null) {
			throw new BusinessException(ErrorCodes.INPUT_001, "CountryIn is null");
		}
	}

}
