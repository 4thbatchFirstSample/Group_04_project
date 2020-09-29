package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.SubModule;

public class DefectConverter {

	public static Defect DefectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		SubModule subModule = new SubModule();
		
		if (defectDto != null) {
			defect.setId(defectDto.getId());
			defect.setName(defectDto.getName());
			defect.setDescription(defectDto.getDescription());
			defect.setStatus(defectDto.getStatus());
			defect.setPriority(defectDto.getPriority());
			defect.setSeverity(defectDto.getSeverity());
			defect.setEnterdName(defectDto.getEnterdName());
			defect.setAssignedto(defectDto.getAssignedto());
			subModule.setId(defectDto.getId());
			defect.setSubModule(subModule);
			
			return defect;
		}
		return null;
	}

	public static List<DefectDto> defectToDefectDto(List<Defect> defectList) {
		List<DefectDto> listDefectDto = new ArrayList<>();
		if (defectList != null) {
			for (Defect defect : defectList) {
				DefectDto defectDto = new DefectDto();
				defectDto.setId(defect.getId());
				defectDto.setName(defect.getName());
				defectDto.setDescription(defect.getDescription());
				defectDto.setStatus(defect.getStatus());
				defectDto.setPriority(defect.getPriority());
				defectDto.setSeverity(defect.getSeverity());
				defectDto.setEnterdName(defect.getEnterdName());
				defectDto.setAssignedto(defect.getAssignedto());
				defectDto.setSubModeleId(defect.getSubModule().getId());

				listDefectDto.add(defectDto);
			}
			return listDefectDto;
		}
		return null;
	}

}