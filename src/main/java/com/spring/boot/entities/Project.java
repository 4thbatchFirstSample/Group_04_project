package com.spring.boot.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany(mappedBy = "user")
	private List<Project> projectRecode = new ArrayList<Project>();

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "project_user", joinColumns = @JoinColumn(name = "projectId"), inverseJoinColumns = @JoinColumn(name = "userId"))
	private List<User> user;

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@NotBlank(message = "Name is not blank feild")
	private String name;
	@NotBlank(message = "Start Date is not blank feild")
	private String startDate;
	@NotBlank(message = "End Date is not blank feild")
	private String endDate;
	@NotBlank(message = "Type is not blank feild")
	private String type;
	@NotBlank(message = "Manager is not blank feild")
	private String manager;
	@NotBlank(message = "Abbreviation is not blank feild")
	private String abbreviation;

	@ManyToMany
	private List<User> userRel;

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

	public void setstartDate(String date) {
		this.startDate = date;
	}

	public String getendDate() {
		return endDate;
	}

	public void setendDate(String date) {
		this.endDate = date;
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