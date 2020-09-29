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
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;
import com.spring.boot.services.SubModuleService;

@RestController
@RequestMapping(value = "api/v1")
public class SubModuleController {

	@Autowired
	private SubModuleService subModuleService;

	@PostMapping(value = "/submodule")
	public ResponseEntity<Object> addSubModule(@RequestBody SubModuleDto subModuleDto) {
		subModuleService.addSubModule(SubModuleConverter.SubModuleDtoToSubModule(subModuleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/submodule") // Working Success!!!
	public List<SubModule> getSubModule() {
		return subModuleService.getSubModule();
	}

	@GetMapping(value = "/submodule/{id}")
	public SubModule getSubModuleById(@PathVariable Long id) {
		return subModuleService.getSubModuleById(id);
	}

	@DeleteMapping(value = "/submodule")
	public void deleteModule(SubModule subModule) {
		subModuleService.deleteSubModule(subModule);
	}

	@DeleteMapping(value = "/submodule/{id}") // Working Success!!!
	public void deleteSubModuleById(@PathVariable Long id) {
		subModuleService.deleteSubModuleById(id);
	}

	@PutMapping(value = "/submodule/{id}")
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto) {
		subModuleService.updateSubModule(SubModuleConverter.SubModuleDtoToSubModule(subModuleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value = "/submodule/module-id/{id}")
	public List<SubModule> getAllSubModuleByModuleId(@PathVariable Long id) {
		return subModuleService.getAllSubModuleByModuleId(id);

	}

}