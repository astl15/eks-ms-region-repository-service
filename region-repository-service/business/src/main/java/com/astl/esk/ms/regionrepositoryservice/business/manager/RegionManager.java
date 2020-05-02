package com.astl.esk.ms.regionrepositoryservice.business.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.astl.esk.ms.regionrepositoryservice.business.dao.RegionDAO;
import com.astl.esk.ms.regionrepositoryservice.business.entity.Country;
import com.astl.esk.ms.regionrepositoryservice.business.entity.Region;
import com.astl.esk.ms.regionrepositoryservice.business.validator.RegionValidator;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;

@Component
public class RegionManager {
	
	@Autowired
	private RegionDAO regionDao;
	
	@Autowired
	private CountryManager countryManager;
	
	public Region createRegion(final RegionIn regionIn) {
		Region region = null;
		RegionValidator.validateInput(regionIn);
		Country country = countryManager.findCountryByShortName(regionIn.getCountryShortName());
		if(country != null) {
			region = new Region.RegionBuilder()
					.addRegionName(regionIn.getRegionName())
					.addRegionShortName(regionIn.getRegionShortName())
					.addRegionCountry(country).build();
			return regionDao.createRegion(region);
		}
		return null;
	}
	 
	public Region findRegionByShortName(final String shortName) {
		return regionDao.findRegionByShortName(shortName);
	}
	
	public List<Region> searchRegions(final SearchRegionIn searchRegionIn) {
		return regionDao.searchRegions(searchRegionIn);
	}

}
