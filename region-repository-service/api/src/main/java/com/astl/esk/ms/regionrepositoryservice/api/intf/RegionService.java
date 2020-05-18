package com.astl.esk.ms.regionrepositoryservice.api.intf;

import java.util.List;

import com.astl.esk.ms.regionrepositoryservice.model.dto.RegionDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;

public interface RegionService {

	RegionDTO createRegion(final RegionIn regionIn);
	
	List<RegionDTO> searchRegions(final SearchRegionIn searchRegionIn);
	
	RegionDTO findRegionByShortName(final String regionShortName);
	
}
