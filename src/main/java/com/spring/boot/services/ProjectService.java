package com.spring.boot.services;

import java.util.Optional;

import com.spring.boot.entities.Project;

public interface ProjectService {

	public void addProject(Project project);

	public void updateProjectById(Project project);

	public Project getProjectid(Long id);

	public void deleteById(Long id);

	public Optional<Project> getByIdProject(Long id);

}
