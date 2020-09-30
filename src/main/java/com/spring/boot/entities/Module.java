package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Module {

	/**
	 * Module DB attributes. PK - Primary key FK - Foreign key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long moduleID; // PK
	private String moduleName;
	private String moduleDesc;

	/**
	 * Design Pattern SingleTon
	 *//*
		 * // create an object of Module private static Module moduleObj = new Module();
		 * 
		 * // Private Constructor // make the constructor private so that this class
		 * cannot be // instantiated private Module() {
		 * 
		 * } // Get the only object available public static Module getInstance() {
		 * return moduleObj; }
		 */

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

	

}
