package com.spring.boot.dto;

public class DefectDto {

	private Long id;
	private String name;
	private String description;
	private String status;
	private String severity;
	private String priority;
	private String enterdName;
	private String assignedto;
	private Long subModeleId;

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
		return enterdName;
	}

	public void setEnterdName(String enterdName) {
		this.enterdName = enterdName;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public Long getSubModeleId() {
		return subModeleId;
	}

	public void setSubModeleId(Long subModeleId) {
		this.subModeleId = subModeleId;
	}
}