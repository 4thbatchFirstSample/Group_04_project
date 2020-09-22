package com.spring.boot.dto;

import java.util.Date;

public class ProjectDto {

	private Long projectDtoId;
	private String name;
	private Date startDate;
	private Date endDate;
	private String type;
	private String manager;
	private String abbreviation;

	public Long getprojectDtoId() {
		return projectDtoId;
	}

	public void setprojectDtoId(Long projectDtoId) {
		this.projectDtoId = projectDtoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getstartDate() {
		return startDate;
	}

	public void setstartDate(Date sDate) {
		this.startDate = sDate;
	}

	public Date getendDate() {
		return endDate;
	}

	public void setendDate(Date eDate) {
		this.endDate = eDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}
