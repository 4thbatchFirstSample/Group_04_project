package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import  com.spring.boot.entities.Defect;

public interface  DefectServices {
	
	public void addDefect(Defect defect);
	
	public  Optional<Defect>  getDefect(Long id);
	
	public void deleteDefect(Long id);
	public void deleteDefects();

	public List<Defect> getDefects();

	public  Defect updateDefect(Defect id);
	
	public  List<Defect>  getByAllDefect(Long id);
	

	


	

}
