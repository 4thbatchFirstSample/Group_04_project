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
public class Defect {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Name feild is must.")
	private String name;
	@NotBlank(message = "Description feild is must.")
	private String description;
	@NotBlank(message = "Status feild is must.")
	private String status;
	@NotBlank(message = "Severity feild is must.")
	private String severity;
	@NotBlank(message = "Priority feild is must.")
	private String priority;
	@NotBlank(message = "Defect Checker Name feild is must.")
	private String defectCheckerName;
	@NotBlank(message = "Assignedto feild is must.")
	private String assignedto;

	@ManyToOne
	@JoinColumn(name = "subModuleId", nullable = false)
	private SubModule subModule;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getEnterdName() {
		return defectCheckerName;
	}

	public void setEnterdName(String enterdName) {
		this.defectCheckerName = enterdName;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getDefectCheckerName() {
		return defectCheckerName;
	}

	public void setDefectCheckerName(String defectCheckerName) {
		this.defectCheckerName = defectCheckerName;
	}

	public SubModule getSubModule() {
		return subModule;
	}

	public void setSubModule(SubModule subModule) {
		this.subModule = subModule;
	}

}