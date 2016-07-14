package com.jwt.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {
	@Id
	private int ProjectID;
	private int ReleaseID;
	private String ProjectName;
	private String ProjectManager;
	private String ProjectDescription;
	private String DateCreated;
	
	public int getReleaseID() {
		return ReleaseID;
	}
	public void setReleaseID(int releaseID) {
		ReleaseID = releaseID;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectManager() {
		return ProjectManager;
	}
	public void setProjectManager(String projectManager) {
		ProjectManager = projectManager;
	}
	public String getProjectDescription() {
		return ProjectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		ProjectDescription = projectDescription;
	}
	public String getDateCreated() {
		return DateCreated;
	}
	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}
}
