package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.SubModule;

public interface SubModuleService {

	public void addSubModule(SubModule subModule);

	public List<SubModule> getSubModule();

	public SubModule getSubModuleById(Long id);
	
	public void deleteSubModule(SubModule subModule);
	
	public void deleteSubModuleById(Long id);
	
	public void updateSubModule(SubModule subModule);

}
