package com.spring.boot.services.imlpementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.SubModulerepository;
import com.spring.boot.services.SubModuleService;

@Service
public class SubModuleServiceImpl implements SubModuleService {

	@Autowired
	private SubModulerepository subModulerepository;

	@Override
	public void addSubModule(SubModule subModule) {
		subModulerepository.save(subModule);
	}

	@Override
	public List<SubModule> getSubModule() {
		return subModulerepository.findAll();
	}

	@Override
	public SubModule getSubModuleById(Long id) {
		return subModulerepository.findById(id).get();
	}

	@Override
	public void deleteSubModule(SubModule subModule) {
		subModulerepository.deleteAll();
	}

	@Override
	public void deleteSubModuleById(Long id) {
		subModulerepository.deleteById(id);
	}

	@Override
	public void updateSubModule(SubModule subModule) {
		subModulerepository.save(subModule);
	}

}