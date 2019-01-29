package edu.fa.model;

public class TrainingObjective {
	private int trainingObjectID;
	private String trainingObjectName;
	private String trainingObjectCode;
	private int trainerID;
	public TrainingObjective(int trainingObjectID, String trainingObjectName, String trainingObjectCode,
			int trainerID) {
		super();
		this.trainingObjectID = trainingObjectID;
		this.trainingObjectName = trainingObjectName;
		this.trainingObjectCode = trainingObjectCode;
		this.trainerID = trainerID;
	}
	public TrainingObjective() {
		super();
	}
	public int getTrainingObjectID() {
		return trainingObjectID;
	}
	public void setTrainingObjectID(int trainingObjectID) {
		this.trainingObjectID = trainingObjectID;
	}
	public String getTrainingObjectName() {
		return trainingObjectName;
	}
	public void setTrainingObjectName(String trainingObjectName) {
		this.trainingObjectName = trainingObjectName;
	}
	public String getTrainingObjectCode() {
		return trainingObjectCode;
	}
	public void setTrainingObjectCode(String trainingObjectCode) {
		this.trainingObjectCode = trainingObjectCode;
	}
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	
	
}
