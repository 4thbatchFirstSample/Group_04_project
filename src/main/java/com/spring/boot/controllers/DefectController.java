package com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.DefectConverter;
import com.spring.boot.converters.SubModuleConverter;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.DefectRepository;
import com.spring.boot.services.DefectService;

@RestController
@RequestMapping(value = "api/v1")
public class DefectController {
	
	@Autowired
	private DefectService defectService;
	
	@PostMapping(value = "/defect")
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto) {
		defectService.addDefect(DefectConverter.DefectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/defect") // Working Success!!!
	public List<Defect> getDefect() {
		return defectService.getDefect();
	}
	
	@GetMapping(value = "/defect/{id}")
	public Defect getDefectById(@PathVariable Long id) {
		return defectService.getDefectById(id);
	}

	@DeleteMapping(value = "/defect")
	public void deleteDefect(Defect defect) {
		defectService.deleteDefect(defect);
	}

	@DeleteMapping(value = "/defect/{id}") // Working Success!!!
	public void deleteDefectById(@PathVariable Long id) {
		defectService.deleteDefectById(id);
	}

	@PutMapping(value = "/defect/{id}")
	public ResponseEntity<Object> updateSubModule(@RequestBody DefectDto defectDto) {
		defectService.updateDefect(DefectConverter.DefectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value = "/defect/submodule-id/{id}")
	public List<Defect> getAllDefectIdBySubModuleId(Long id){
		return defectService.getAllDefectIdBySubModuleId(id);
	}

}
