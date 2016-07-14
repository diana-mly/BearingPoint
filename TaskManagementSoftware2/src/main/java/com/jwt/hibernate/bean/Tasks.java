package com.jwt.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")

public class Tasks {
	@Id
	private int TaskID;
	private int ProjectID;
	private String TaskTitle;
	private String TaskDescription;
	private int PriorityID;
	private int StatusID;
	private String DateCreated;
	private String DateModified;
	private int Creator;
	private int Implementer;
	private int Tester;
	private int Designer;
	public int getProjectID() {
		return ProjectID;
	}
	public void setProjectID(int projectID) {
		ProjectID = projectID;
	}
	public String getTaskTitle() {
		return TaskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		TaskTitle = taskTitle;
	}
	public String getTaskDescription() {
		return TaskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		TaskDescription = taskDescription;
	}
	public int getPriorityID() {
		return PriorityID;
	}
	public void setPriorityID(int priorityID) {
		PriorityID = priorityID;
	}
	public int getStatusID() {
		return StatusID;
	}
	public void setStatusID(int statusID) {
		StatusID = statusID;
	}
	public String getDateCreated() {
		return DateCreated;
	}
	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}
	public String getDateModified() {
		return DateModified;
	}
	public void setDateModified(String dateModified) {
		DateModified = dateModified;
	}
	public int getCreator() {
		return Creator;
	}
	public void setCreator(int creator) {
		Creator = creator;
	}
	public int getImplementer() {
		return Implementer;
	}
	public void setImplementer(int implementer) {
		Implementer = implementer;
	}
	public int getTester() {
		return Tester;
	}
	public void setTester(int tester) {
		Tester = tester;
	}
	public int getDesigner() {
		return Designer;
	}
	public void setDesigner(int designer) {
		Designer = designer;
	}


}
