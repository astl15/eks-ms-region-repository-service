package com.astl.esk.ms.regionrepositoryservice.business.validator;

import org.springframework.util.StringUtils;

import com.astl.esk.ms.regionrepositoryservice.business.exception.BusinessException;
import com.astl.esk.ms.regionrepositoryservice.business.validator.utils.ErrorCodes;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;

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
