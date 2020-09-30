package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;

@Service
public class ModuleConverter {

	public static Module moduleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();
		if(moduleDto!=null) {
			module.setModuleID(moduleDto.getId());
			module.setModuleName(moduleDto.getName());
			module.setModuleDesc(moduleDto.getDesc());
			return module;
			
		}
		return null;
		
	}
	
	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList){
		List <ModuleDto> listModuleDto = new ArrayList<>();
		if(moduleList!=null) {
			for (Module module: moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				moduleDto.setId(module.getModuleID());
				moduleDto.setName(module.getModuleName());
				moduleDto.setDesc(module.getModuleDesc());
				
				listModuleDto.add(moduleDto);
			}
			return listModuleDto;
		}
		
		return null;
		
	}
}
