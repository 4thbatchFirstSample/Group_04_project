package com.spring.boot.services.imlpementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;
import com.spring.boot.services.ModuleService;

public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> getModule(Module module) {
		return moduleRepository.findAll();
	}

	@Override
	public Optional<Module> getModuleById(Long moduleId) {
		return moduleRepository.findById(moduleId);
	}

	@Override
	public void deleteModule(Module module) {
		moduleRepository.deleteAll();
	}

	@Override
	public void deleteModuleById(Long moduleId) {
		moduleRepository.deleteById(moduleId);
	}

	@Override
	public void updateModule(Module module) {
		moduleRepository.save(module);
	}

}
