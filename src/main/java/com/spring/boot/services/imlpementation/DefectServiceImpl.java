package com.spring.boot.services.imlpementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.DefectRepository;
import com.spring.boot.services.DefectService;

@Service
public class DefectServiceImpl implements DefectService {

	@Autowired
	private DefectRepository defectRepository;

	@Override
	public void addDefect(Defect defect) {
		defectRepository.save(defect);
	}

	@Override
	public List<Defect> getDefect() {
		return defectRepository.findAll();
	}

	@Override
	public Defect getDefectById(Long id) {
		return defectRepository.findById(id).get();
	}

	@Override
	public void deleteDefect(Defect defect) {
		defectRepository.deleteAll();
	}

	@Override
	public void deleteDefectById(Long id) {
		defectRepository.deleteById(id);
	}

	@Override
	public void updateDefect(Defect defect) {
		defectRepository.save(defect);
	}

}