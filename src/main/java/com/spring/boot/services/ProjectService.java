package com.spring.boot.services;

import java.util.Optional;

import com.spring.boot.entities.Project;

public interface ProjectService {

	public void addProject(Project project);

	public Optional<Project> getProject(Long id);

	public void deleteById(Long id);

	public void updateById(Long id);

//	public void updateProject(Project project);
//	public Optional<Project> getByIdProject(Long id);
}
