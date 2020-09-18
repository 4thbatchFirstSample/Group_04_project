package com.spring.boot.service.implementation;
/**
 * @author Johnvesly Alanroy
 * @since 18-09-2020
 */
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;
import com.spring.boot.services.ModuleService;

public class ModuleServiceImpl implements ModuleService  {
	/***
	 * Services Implementation
	 * Implementation of CRUD APIs
	 */
	@Autowired
	private ModuleRepository moduleRepository;
	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
	}

}
