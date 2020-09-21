 package com.spring.boot.services.implementation;



import java.util.List;
import java.util.Optional;

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
	public Defect updateDefect(Defect id) {
		// TODO Auto-generated method stub
		return defectRepository.save(id);
	}
	
	
	@Override
	public void deleteDefect(Long id) {
		// TODO Auto-generated method stub
		defectRepository.deleteById(id);
	}

	


@Override
	public List<Defect> getDefects() {
		// TODO Auto-generated method stub
		return defectRepository.findAll();
	}



@Override
public Optional<Defect> getDefect(Long id) {
	// TODO Auto-generated method stub
	return defectRepository.findById(id);
}



@Override
public void deleteDefects() {
	// TODO Auto-generated method stub
	defectRepository.deleteAll();
}

	

	



}