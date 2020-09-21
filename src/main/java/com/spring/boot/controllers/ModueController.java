package com.spring.boot.controllers;

import java.util.List;
import java.util.Optional;

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

	@PostMapping(value = "/postmodule")
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto) {
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/getmodule")
	public List<Module> getProject(@RequestBody Module module) {
		return moduleService.getModule(module);
	}

	@GetMapping(value = "/getmoduleid/{id}")
	public Optional<Module> getModuleById(@RequestBody ModuleDto moduleDto, @PathVariable Long moduleId) {
		return moduleService.getModuleById(moduleId);
	}

	@DeleteMapping(value = "/deletemodule")
	public void deleteModule(Module module) {
		moduleService.deleteModule(module);
	}

	@DeleteMapping(value = "deletemoduleid/{id}")
	public void deleteModuleById(@PathVariable Long moduleId) {
		moduleService.deleteModuleById(moduleId);
	}

	@PutMapping(value = "/updatemodule/{id}")
	public ResponseEntity<Object> updateModule(@RequestBody ModuleDto moduleDto) {
		moduleService.updateModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.CREATED);
	}

}
