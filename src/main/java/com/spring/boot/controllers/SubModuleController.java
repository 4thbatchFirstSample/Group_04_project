package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.SubModuleConverter;
import com.spring.boot.dto.SubModuleDto;
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

}
