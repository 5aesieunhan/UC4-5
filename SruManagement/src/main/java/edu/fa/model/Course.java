package edu.fa.model;

import java.sql.Date;

public class Course {
	private int courseID;
	private String courseName;
	private Date openDate;
	private String note;
	private int trainerID;
	public Course(int courseID, String courseName, Date openDate, String note, int trainerID) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.openDate = openDate;
		this.note = note;
		this.trainerID = trainerID;
	}
	public Course() {
		super();
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	
	
}
