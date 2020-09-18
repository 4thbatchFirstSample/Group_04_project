package com.spring.boot.dto;
/**
 * @author Johnvesly Alanroy
 * @since 18th September 2020
 */
public class ModuleDto {
	/**
	 * User UI Dto
	 */
	private String moduleName;
	private String moduleDesc;
	private long projectID; // FK

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
