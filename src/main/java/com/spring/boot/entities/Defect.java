package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Defect {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long defectId;
	private String smId;
	private String stasus;
	private String name;
	private String description;
	private String priority;
	private String severity;
	private String asignto;
	public Long getId() {
		return defectId;
	}
	public void setId(Long id) {
		this.defectId = id;
	}
	public String getSmId() {
		return smId;
	}
	public void setSmId(String smId) {
		this.smId = smId;
	}
	public String getStasus() {
		return stasus;
	}
	public void setStasus(String stasus) {
		this.stasus = stasus;
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
	
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getAsignto() {
		return asignto;
	}
	public void setAsignto(String asignto) {
		this.asignto = asignto;
	}
	
	
}
