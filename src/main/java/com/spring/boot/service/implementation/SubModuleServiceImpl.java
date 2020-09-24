package com.spring.boot.service.implementation;

import java.util.List;

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

	@Override
	public List<SubModule> getSubModule() {
		return subModuleRepository.findAll();
	}

	@Override
	public SubModule getSubModuleById(Long id) {
		return subModuleRepository.findById(id).get();
	}

	@Override
	public void deleteSubModule(SubModule subModule) {
		subModuleRepository.deleteAll();
	}

	@Override
	public void deleteSubModuleById(Long id) {
		subModuleRepository.deleteById(id);
	}

	@Override
	public void updateSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);
		
	}
	
	

}
