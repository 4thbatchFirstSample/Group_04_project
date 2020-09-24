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

import com.spring.boot.converters.SubModuleConverter;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.SubModule;
import com.spring.boot.services.SubModuleService;

@RestController
@RequestMapping(value = "api/v2")
public class SubModuleController {

	@Autowired
	private SubModuleService subModuleService;
	@Autowired
	private SubModuleConverter subModuleConverter;

	@SuppressWarnings("static-access")
	@PostMapping(value = "/sub-module")
	public ResponseEntity<Object> addSubModule(@RequestBody SubModuleDto subModuleDto) {
		subModuleService.addSubModule(subModuleConverter.subModuleDToSubModule(subModuleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/sub-module")
	public List<SubModule> getSubModule() {
		return subModuleService.getSubModule();
	}

	@GetMapping(value = "/sub-module/{id}")
	public SubModule getSubModuleById(@PathVariable Long id) {
		return subModuleService.getSubModuleById(id);
	}

	@DeleteMapping(value = "/sub-module")
	public void deleteModule(SubModule subModule) {
		subModuleService.deleteSubModule(subModule);
	}
	
	@DeleteMapping(value = "/sub-module/{id}")
	public void deleteSubModuleById(@PathVariable Long id) {
		subModuleService.deleteSubModuleById(id);
	}
	
	@PutMapping(value = "/sub-module/{id}")
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto) {
		subModuleService.updateSubModule(SubModuleConverter.subModuleDToSubModule(subModuleDto));
		return new  ResponseEntity<Object>("updated", HttpStatus.OK);
	}
}
