package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;

public class DefectConverter {
	
	public static Defect DefectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		if (defectDto != null) {
			defect.setId(defectDto.getId());
			defect.setName(defectDto.getName());
			defect.setDescription(defectDto.getDescription());
			defect.setStatus(defectDto.getStatus());
			defect.setPriority(defectDto.getPriority());
			defect.setSeverity(defectDto.getSeverity());
			defect.setEnterdName(defectDto.getEnterdName());
			defect.setAssignedto(defectDto.getAssignedto());
			
			return defect;
		}
		return null;
	}

	public static List<DefectDto> defectToDefectDto(List<Defect> defectList) {
		List<DefectDto> listDefectDto = new ArrayList<>();
		if (defectList != null) {
			for (Defect defect : defectList) {
				DefectDto defectDto = new DefectDto();
				defect.setId(defectDto.getId());
				defect.setName(defectDto.getName());
				defect.setDescription(defectDto.getDescription());
				defect.setStatus(defectDto.getStatus());
				defect.setPriority(defectDto.getPriority());
				defect.setSeverity(defectDto.getSeverity());
				defect.setEnterdName(defectDto.getEnterdName());
				defect.setAssignedto(defectDto.getAssignedto());

				listDefectDto.add(defectDto);
			}
			return listDefectDto;
		}
		return null;
	}

}