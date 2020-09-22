package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Defect;

public interface DefectService {

	public void addDefect(Defect defect);

	public List<Defect> getDefect();

	public Defect getDefectById(Long id);

	public void deleteDefect(Defect defect);

	public void deleteDefectById(Long id);

	public void updateDefect(Defect defect);

}