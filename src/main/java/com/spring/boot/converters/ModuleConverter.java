package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.Project;

  @Service
public class ModuleConverter {

	public static Module moduleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();
		Project project = new Project();
		if (moduleDto != null) {

			module.setId(moduleDto.getId());
			module.setName(moduleDto.getName());
			module.setDescription(moduleDto.getDescription());
			project.setId(moduleDto.getProjectId());
			module.setProject(project);

			return module;
		}
		return null;
	}

	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList) {
		List<ModuleDto> listModuleDto = new ArrayList<>();
		if (moduleList != null) {
			for (Module module : moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				moduleDto.setId(module.getId());
				moduleDto.setName(module.getName());
				moduleDto.setDescription(module.getDescription());
				moduleDto.setProjectId(module.getProject().getId());

				listModuleDto.add(moduleDto);
			}
			return listModuleDto;
		}
		return null;
	}

}