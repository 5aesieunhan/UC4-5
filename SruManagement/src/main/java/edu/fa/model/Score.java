package edu.fa.model;

public class Score {
	private int scoreID;
	private int trainingObjectID;
	private int traineeID;
	private String name;
	private double value;
	public Score(int scoreID, int trainingObjectID, int traineeID, String name, double value) {
		super();
		this.scoreID = scoreID;
		this.trainingObjectID = trainingObjectID;
		this.traineeID = traineeID;
		this.name = name;
		this.value = value;
	}
	public Score() {
		super();
	}
	public int getScoreID() {
		return scoreID;
	}
	public void setScoreID(int scoreID) {
		this.scoreID = scoreID;
	}
	public int getTrainingObjectID() {
		return trainingObjectID;
	}
	public void setTrainingObjectID(int trainingObjectID) {
		this.trainingObjectID = trainingObjectID;
	}
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
}
