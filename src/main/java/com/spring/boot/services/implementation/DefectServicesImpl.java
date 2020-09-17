 package com.spring.boot.services.implementation;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.DefectRepository;
import com.spring.boot.services.DefectServices;


@Service
public class DefectServicesImpl implements DefectServices{
	
	@Autowired
	private DefectRepository defectRepository;

	@Override
	public void addDefect(Defect defect) {
		// TODO Auto-generated method stub
		defectRepository.save(defect);
	}

	@Override
	public List<Defect> getDefect() {
		// TODO Auto-generated method stub
		return defectRepository.findAll();
		
	}

	@Override
	public void deleteDefect(Long id) {
		// TODO Auto-generated method stub
		defectRepository.deleteById(id);
	}

	

	



}
