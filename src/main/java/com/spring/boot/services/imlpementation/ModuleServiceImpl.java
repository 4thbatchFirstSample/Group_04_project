package com.spring.boot.services.imlpementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;
import com.spring.boot.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> getModule() {
		return moduleRepository.findAll();
	}

	@Override
	public Module getModuleById(Long id) {
		return moduleRepository.findById(id).get();
	}
/****/
	@Override
	public void deleteModule(Module module) {
		moduleRepository.deleteAll();
	}
/***/
	@Override
	public void deleteModuleById(Long moduleId) {
		moduleRepository.deleteById(moduleId);
	}
/***/
	@Override
	public void updateModule(Module module) {
		moduleRepository.save(module);
	}
/**/
	@Override
	public List<Module> getAllModuleByProjectId(Long id) { // S=>4
		return moduleRepository.findByProjectId(id);
	}

}