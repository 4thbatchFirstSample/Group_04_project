package com.spring.boot.services.imlpementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;
import com.spring.boot.services.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void updateProjectById(Project project) {
		projectRepository.save(project);
	}

	@Override
	public Project getProjectid(Long id) {
		return projectRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		projectRepository.deleteById(id);
	}

	@Override
	public Optional<Project> getByIdProject(Long id) {
		return projectRepository.findById(id);
	}

	@Override
	public boolean proTableId(Long id) {
		return false;
	}

}