package com.spring.boot.services;

import java.util.List;
import  com.spring.boot.entities.Defect;

public interface DefectServices {
	
	public void addDefect(Defect defect);
	
	public  List<Defect> getDefect();
	
	public void deleteDefect(Long id);
	
	public void alterDefect(Defect defect);

	

}
