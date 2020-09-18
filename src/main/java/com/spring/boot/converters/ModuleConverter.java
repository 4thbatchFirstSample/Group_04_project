package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;

/***
 *  @author Johnvesly Alanroy
 *  @since 18-09-2020
 */
@Service
 public class ModuleConverter {
	 // moduleDTO to Module Entity Converter POST
	 public static Module moduleDTOModule (ModuleDto moduleDto)
	 {
		 Module module = Module.getInstance(); // object of Module
		 if(moduleDto != null) {
			 module.setModuleID(moduleDto.getProjectID());
			 module.setModuleName(moduleDto.getModuleName());
			 module.setModuleDesc(moduleDto.getModuleDesc());
			 return module;
		 }
		return null;
		 
	 }
	 
	 // Module to ModuleDto converter GET
	 public static List <ModuleDto> ModuleToModuleDTO(List<Module> moduleList){
		 List<ModuleDto> listModuleDto = new ArrayList<>();
		 if(moduleList != null) {
			 for (Module module : moduleList) {
				 ModuleDto moduleDto = new ModuleDto();
				 moduleDto.setProjectID(module.getModuleID());
				 moduleDto.setModuleName(module.getModuleName());
				 moduleDto.setModuleDesc(module.getModuleDesc());
				 
				 listModuleDto.add(moduleDto);
			 }
			 return listModuleDto;
		 }
		 return null;
	 }
}
