package edu.fa.model;

import java.sql.Date;

public class Trainee {
	private int traineeID;
	private int courseID;
	private String branch;
	private String parentDepartment;
	private Date recInterviewDate;
	private String recInterviewStatus;
	private String note;
	private String traineeStatus;
	private String university;
	private String faculty;
	public Trainee(int traineeID, int courseID, String branch, String parentDepartment, Date recInterviewDate,
			String recInterviewStatus, String note, String traineeStatus, String university, String faculty) {
		super();
		this.traineeID = traineeID;
		this.courseID = courseID;
		this.branch = branch;
		this.parentDepartment = parentDepartment;
		this.recInterviewDate = recInterviewDate;
		this.recInterviewStatus = recInterviewStatus;
		this.note = note;
		this.traineeStatus = traineeStatus;
		this.university = university;
		this.faculty = faculty;
	}
	public Trainee() {
		super();
	}
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getParentDepartment() {
		return parentDepartment;
	}
	public void setParentDepartment(String parentDepartment) {
		this.parentDepartment = parentDepartment;
	}
	public Date getRecInterviewDate() {
		return recInterviewDate;
	}
	public void setRecInterviewDate(Date recInterviewDate) {
		this.recInterviewDate = recInterviewDate;
	}
	public String getRecInterviewStatus() {
		return recInterviewStatus;
	}
	public void setRecInterviewStatus(String recInterviewStatus) {
		this.recInterviewStatus = recInterviewStatus;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTraineeStatus() {
		return traineeStatus;
	}
	public void setTraineeStatus(String traineeStatus) {
		this.traineeStatus = traineeStatus;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
}
