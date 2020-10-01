   package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;

public class DefectConverter {
	
	// DefectDto to defect Entity Converter
		public static Defect DEFECTDtoToDefect(DefectDto defectDto) {
			Defect defect = new Defect();
			SubModule subModule = new SubModule();
			if (defectDto != null) {
				defect.setId(defectDto.getId());
				defect.setName(defectDto.getName());
				
				subModule.setId(defectDto.getsubModuleId());
				defect.setSubmodule(subModule);
				return defect;
			}
			return null;
		}

		// defect to defectDto list converter

		public static List<DefectDto> DefectToDefectDto(List<Defect> defectList) {
			List<DefectDto> listDefectDto = new ArrayList<>();
			if (defectList != null) {
				for (Defect defect : defectList) {
					DefectDto defectDto = new DefectDto();
					defectDto.setId(defect.getId());
					defectDto.setName(defect.getName());
			
					defectDto.setsubModuleId(subModule.getId());
					listDefectDto.add(defectDto);
				}
				return listDefectDto;
			}
			return null;

			 
		}

}
