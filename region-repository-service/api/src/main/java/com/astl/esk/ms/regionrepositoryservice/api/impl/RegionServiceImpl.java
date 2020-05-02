package com.astl.esk.ms.regionrepositoryservice.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.astl.esk.ms.regionrepositoryservice.api.intf.RegionService;
import com.astl.esk.ms.regionrepositoryservice.business.manager.RegionManager;
import com.astl.esk.ms.regionrepositoryservice.business.mapper.RegionMapper;
import com.astl.esk.ms.regionrepositoryservice.model.dto.RegionDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;

public class RegionServiceImpl implements RegionService{

	@Autowired
	private RegionManager regionManager;
	
	@Override
	public RegionDTO createRegion(final RegionIn regionIn) {
		return RegionMapper.mapFrom(regionManager.createRegion(regionIn));
	}

	@Override
	public List<RegionDTO> searchRegions(final SearchRegionIn searchRegionIn) {
		return RegionMapper.mapFrom(regionManager.searchRegions(searchRegionIn));
	}

}
