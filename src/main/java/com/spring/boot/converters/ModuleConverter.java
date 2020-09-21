package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.Project;

@Service
public class ModuleConverter {

	public static Module moduleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();
		if (moduleDto != null) {
			module.setModuleId(moduleDto.getModuleId());
			module.setName(moduleDto.getName());
			module.setDescription(moduleDto.getDescription());
			return module;
		}
		return null;
	}

	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList) {
		List<ModuleDto> listModuleDto = new ArrayList<>();
		if (moduleList != null) {
			for (Module module : moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				module.setModuleId(moduleDto.getModuleId());
				module.setName(moduleDto.getName());
				module.setDescription(moduleDto.getDescription());

				listModuleDto.add(moduleDto);
			}
			return listModuleDto;
		}
		return null;
	}

}
