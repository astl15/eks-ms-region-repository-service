package com.astl.esk.ms.regionrepositoryservice.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.astl.esk.ms.regionrepositoryservice.api.intf.RegionService;
import com.astl.esk.ms.regionrepositoryservice.model.dto.RegionDTO;
import com.astl.esk.ms.regionrepositoryservice.model.in.RegionIn;
import com.astl.esk.ms.regionrepositoryservice.model.in.SearchRegionIn;

@RestController
@RequestMapping("/v1/regions")
public class RegionController {

	@Autowired
	private RegionService regionService;
	
	@RequestMapping(
			value = "/create",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE}, 
			method = RequestMethod.POST)
	public ResponseEntity<RegionDTO> createRegion(@RequestBody RegionIn regionIn) {
		RegionDTO region = regionService.createRegion(regionIn);
		return new ResponseEntity<RegionDTO>(region, HttpStatus.CREATED);
	}
	
	@RequestMapping(
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE}, 
			method = RequestMethod.POST)
	public ResponseEntity<List<RegionDTO>> searchRegions(@RequestBody SearchRegionIn searchRegionIn) {
		List<RegionDTO> regions = regionService.searchRegions(searchRegionIn);
		return new ResponseEntity<List<RegionDTO>>(regions, HttpStatus.OK);
	}
	
}
