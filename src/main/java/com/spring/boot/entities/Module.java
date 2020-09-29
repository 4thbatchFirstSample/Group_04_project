package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@NotBlank(message = "Name feild is must.")
	private String name;
	@NotBlank(message = "Description feild is must.")
	private String description;

	@ManyToOne // Many to many Relationship S=>1
	@JoinColumn(name = "projectId", nullable = false) // projectId is column name.
	private Project project; // We want all of project data so we call entity object. // Then write GET SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}