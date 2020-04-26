package com.astl.esk.ms.regionrepositoryservice.dao;

import java.util.List;

import com.astl.esk.ms.regionrepositoryservice.entity.Region;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;


public interface RegionDAO {

	Region createRegion(Region region);
	
	Region findRegionByShortName(String shortName);
	
	List<Region> searchRegions(SearchRegionIn searchRegionIn);
	
}
