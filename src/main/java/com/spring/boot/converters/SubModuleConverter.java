package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;

public class SubModuleConverter {

	public static SubModule SubModuleDtoToSubModule(SubModuleDto subModuleDto) {
		SubModule subModule = new SubModule();
		Module module = new Module();

		if (subModuleDto != null) {
			subModule.setId(subModuleDto.getId());
			subModule.setName(subModuleDto.getName());
			subModule.setDescription(subModuleDto.getDescription());
			module.setId(subModuleDto.getId());
			subModule.setModule(module);
			return subModule;
			
		}
		return null;
	}

	public static List<SubModuleDto> subModuleToSubModuleDto(List<SubModule> subModuleList) {
		List<SubModuleDto> listSubModuleDto = new ArrayList<>();
		if (subModuleList != null) {
			for (SubModule subModule : subModuleList) {
				SubModuleDto subModuleDto = new SubModuleDto();
				subModuleDto.setId(subModule.getId());
				subModuleDto.setName(subModule.getName());
				subModuleDto.setDescription(subModule.getDescription());
				subModuleDto.setModuleId(subModule.getModule().getId());

				listSubModuleDto.add(subModuleDto);
			}
			return listSubModuleDto;
		}
		return null;
	}

}