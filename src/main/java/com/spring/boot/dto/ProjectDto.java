package com.spring.boot.dto;

import java.util.Date;

public class ProjectDto {

	private Long id;
	private String name;
	private String startDate;
	private String endDate;
	private String type;
	private String manager;
	private String abbreviation;

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

	public String getstartDate() {
		return startDate;
	}

	public void setstartDate(String sDate) {
		this.startDate = sDate;
	}

	public String getendDate() {
		return endDate;
	}

	public void setendDate(String eDate) {
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
