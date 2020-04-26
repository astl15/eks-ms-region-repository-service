package com.astl.esk.ms.regionrepositoryservice.validator;

import org.springframework.util.StringUtils;

import com.astl.esk.ms.regionrepositoryservice.exception.BusinessException;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;
import com.astl.esk.ms.regionrepositoryservice.validator.utils.ErrorCodes;

public class RegionValidator {
	
	private RegionValidator() {}

	public static void validateInput(final RegionIn input) {
		if(input != null && (StringUtils.isEmpty(input.getRegionName())
				|| StringUtils.isEmpty(input.getRegionShortName()))) {
			throw new BusinessException(ErrorCodes.INPUT_002,"RegionIn has invalid format");
		}else if(input == null){
			throw new BusinessException(ErrorCodes.INPUT_001,"RegionIn is null");
		}
	}
}
