package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.SubModule;



@Service
public class SubModuleConverter {
	// SubModuleDto to SubModule Entity Converter POST
		public static SubModule subModuleDToSubModule(SubModuleDto subModuleDto) {
			SubModule subModule = new SubModule();
			if (subModuleDto != null) {
				subModule.setModuleId(subModuleDto.getModuleId());
				subModule.setName(subModuleDto.getFirstname());
				subModule.setDescription(subModuleDto.getDescription());
				return subModule;
			}
			return null;
		}
		
		//SubModule to SubModuleDto converter GET
		
		public static List<SubModuleDto> SubModuleToSubModuleDto(List<SubModule> subModuleList){
			List<SubModuleDto> listSubMOduleDto = new ArrayList<>();
			if (subModuleList != null) {
			for (SubModule subModule : subModuleList) {
				SubModuleDto subModuleDto = new SubModuleDto();
				subModuleDto.setModuleId(subModule.getModuleId());
				subModuleDto.setFirstname(subModule.getName());
				subModuleDto.setDescription(subModule.getDescription());
				
				listSubMOduleDto.add(subModuleDto);
			}
			return listSubMOduleDto;
			}
			
			return null;
		}
		
}

