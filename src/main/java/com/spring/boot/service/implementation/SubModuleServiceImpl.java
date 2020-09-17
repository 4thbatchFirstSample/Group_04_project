package com.spring.boot.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.SubModuleRepository;
import com.spring.boot.services.SubModuleService;

@Service
public class SubModuleServiceImpl implements SubModuleService {
	@Autowired
	private SubModuleRepository subModuleRepository;

	@Override
	public void addSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);
		
	}

}
