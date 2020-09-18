package com.spring.boot.entities;

/***
 * @author Johnvesly Alanroy
 * @since 18th of September 2020
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Module {
	/**
	 * Module DB attributes.
	 * PK - Primary key
	 * FK - Foreign key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long moduleID; // PK
	private String moduleName;
	private String moduleDesc;
	private long projectID; // FK

	/**
	 * Design Pattern SingleTon
	 */
	// create an object of Module
	private static Module moduleObj = new Module();

	// Private Constructor
	// make the constructor private so that this class cannot be
	// instantiated
	private Module() {

	}
	// Get the only object available
	public static Module getInstance() {
		return moduleObj;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */

	public long getModuleID() {
		return moduleID;
	}

	public void setModuleID(long moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDesc() {
		return moduleDesc;
	}

	public void setModuleDesc(String moduleDesc) {
		this.moduleDesc = moduleDesc;
	}

	public long getProjectID() {
		return projectID;
	}

	public void setProjectID(long projectID) {
		this.projectID = projectID;
	}

}
