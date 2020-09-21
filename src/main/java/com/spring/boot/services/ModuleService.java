package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.Module;

public interface ModuleService {
	
	public void addModule(Module module);
	
	public List<Module> getModule(Module module);
	
	public Optional<Module> getModuleById(Long moduleId);
	
	public void deleteModule(Module module);
	
	public void deleteModuleById(Long moduleId);
	
	public void updateModule(Module module);

}
