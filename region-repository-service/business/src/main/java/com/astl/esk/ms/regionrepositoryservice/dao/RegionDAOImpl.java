package com.astl.esk.ms.regionrepositoryservice.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.astl.esk.ms.regionrepositoryservice.dao.utils.RegionSpecifications;
import com.astl.esk.ms.regionrepositoryservice.entity.Region;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;

@Component
public class RegionDAOImpl implements RegionDAO {

	@Autowired
	private RegionRepository regionRepository;

	@Override
	public Region createRegion(Region region) {
		return regionRepository.save(region);
	}

	@Override
	public Region findRegionByShortName(final String regionShortName) {
		return regionRepository.findByRegionShortName(regionShortName);
	}

	@Override
	public List<Region> searchRegions(final SearchRegionIn searchRegionIn) {
		if (searchRegionIn != null) {
			if (searchRegionIn.getPageNumber() != null && searchRegionIn.getNrOfResultsPerPage() != null
					&& searchRegionIn.getCountryShortName() != null) {
				Pageable pageable = PageRequest.of(searchRegionIn.getPageNumber(),
						searchRegionIn.getNrOfResultsPerPage());

				Page<Region> paginatedRegions = regionRepository.findAll(RegionSpecifications
						 .getRegionsByCountryShortName(searchRegionIn.getCountryShortName()), pageable);

				if (paginatedRegions.hasContent()) {
					return paginatedRegions.getContent();
				}
			}
			
			if (searchRegionIn.getCountryShortName() != null) {
				return regionRepository.findAll(
						RegionSpecifications.getRegionsByCountryShortName(searchRegionIn.getCountryShortName()));
			}
		}
		return Collections.emptyList();
	}

}
