package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.services.ModuleService;

@RestController
@RequestMapping(value = "api/v1") // POSTMAN URL 
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	@Autowired
	private ModuleConverter moduleconverter;
	
	@SuppressWarnings("static-access")
	@PostMapping(value = "/module")
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto){
		moduleService.addModule(ModuleConverter.moduleDTOModule(moduleDto));
		return new ResponseEntity <Object>("Added Successfully", HttpStatus.CREATED);
	}
}
