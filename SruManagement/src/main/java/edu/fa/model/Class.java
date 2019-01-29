package edu.fa.model;

import java.sql.Date;
import java.util.List;

public class Class {
	private int classID;
	private String className;
	private Date openDate;
	private String note;
	private int trainerID;
	private List<Trainee> listTrainee;
	public Class(int classID, String className, Date openDate, String note, int trainerID, List<Trainee> listTrainee) {
		super();
		this.classID = classID;
		this.className = className;
		this.openDate = openDate;
		this.note = note;
		this.trainerID = trainerID;
		this.listTrainee = listTrainee;
	}
	public Class() {
		super();
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
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
	public List<Trainee> getListTrainee() {
		return listTrainee;
	}
	public void setListTrainee(List<Trainee> listTrainee) {
		this.listTrainee = listTrainee;
	}
	
	
	
}
