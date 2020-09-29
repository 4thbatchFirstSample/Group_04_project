package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Module;

public interface ModuleService {

	public void addModule(Module module);

	public List<Module> getModule();

	public Module getModuleById(Long id);

	public void deleteModule(Module module);

	public void deleteModuleById(Long id);

	public void updateModule(Module module);

	public List<Module> getAllModuleByProjectId(Long id); // Write the method S=>3

}