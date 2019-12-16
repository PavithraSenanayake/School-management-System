package com.SchoolManagementSyatem;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid; //30000 per year
	private int feesTotal; //initialy 0.00
	
	public Student(int id,String name,int grade) {
		
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	
	public int getReamainingFees() {
		return feesTotal - feesPaid;
	}
	
	public String toString() {
		return "student's name " +name+ " total fees paid so far " +feesPaid;
		
	}
}

