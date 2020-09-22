package com.spring.boot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class User {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String userName;
	private String password;

//	@ManyToMany(cascade = { CascadeType.ALL })
//	@JoinTable(name = "user_project", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "projectId"))
//	private List<Project> project;
//
//	public List<Project> getProject() {
//		return project;
//	}
//
//	public void setProject(List<Project> project) {
//		this.project = project;
//	}

	public String getUserName() {
		return userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}