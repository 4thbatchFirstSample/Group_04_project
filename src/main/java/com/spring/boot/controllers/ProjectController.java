package com.spring.boot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ProjectConverter;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value = "api/v1") // Thread path URL
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@PostMapping(value = "/postproject") // Last path URL
	public ResponseEntity<Object> addProject(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/getproject/{id}")
	public Optional<Project> getProject(@RequestBody ProjectDto projectDto, @PathVariable Long id) {
		return projectService.getProject(id);
	}

//	@DeleteMapping(value = "/deleteproject/{id}")
//	public ResponseEntity<Project> deleteProject(@RequestBody ProjectDto projectDto, @PathVariable Long id){
//		projectService.deleteProject(ProjectConverter.projectDtoToProject(projectDto));
//		return null;
//	}

//	@DeleteMapping(value = "/deleteproject/{id}")
//	public ResponseEntity<Project> deleteProject(@PathVariable Long id) {
//	      projectService.deleteProject(null);
//	      return null;		
//	}

	@DeleteMapping(value = "deleteproject/{id}")
	public void deleteProject(@PathVariable Long id) {
		projectService.deleteById(id);
	}

	@PutMapping(value = "putproject/{id}")
	public void updateById(@PathVariable Long id) {
		projectService.updateById(id);
	}

}
