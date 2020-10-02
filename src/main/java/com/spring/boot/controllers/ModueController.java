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

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.services.ModuleService;

@RestController
@RequestMapping(value = "api/v1")
public class ModueController {

	@Autowired
	private ModuleService moduleService;

	@PostMapping(value = "/module")
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto) {
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/module")	// Working Success!!!
	public List<Module> getModule() {
		return moduleService.getModule();
	}

	@GetMapping(value = "/module/{id}")	// Working Success!!!
	public Module getModuleById(@PathVariable Long id) {
		return moduleService.getModuleById(id);
	}

	@DeleteMapping(value = "/module")	
	public void deleteModule(Module module) {
		moduleService.deleteModule(module);
	}

	@DeleteMapping(value = "/module/{id}")	// Working Success!!!
	public void deleteModuleById(@PathVariable Long id) {
		moduleService.deleteModuleById(id);
	}

	@PutMapping(value = "/module/{id}")	
	public ResponseEntity<Object> updateModule(@RequestBody ModuleDto moduleDto) {
		moduleService.updateModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
 
	@GetMapping(value = "/module/project-id/{id}")	// Working Success!!!	// S=>5
	public List<Module> getAllModuleByProjectId(@PathVariable Long id) {
		return moduleService.getAllModuleByProjectId(id);

	}

}