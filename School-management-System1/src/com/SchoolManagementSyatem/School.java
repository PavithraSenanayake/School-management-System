package com.SchoolManagementSyatem;

import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static  int TotalMoneySpend;
	private static int  TotalMoneyEarned;
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		TotalMoneyEarned = 0;
		TotalMoneySpend = 0;
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudents(Student student) {
		students.add(student);
	}


	public int getTotalMoneySpend() {
		return TotalMoneySpend;
	}


	public static void updateTotalMoneySpend(int MoneySpend) {
		TotalMoneyEarned-=MoneySpend;
	}


	public int getTotalMoneyEarned() {
		return TotalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int MoneyEarned) {
		TotalMoneyEarned +=MoneyEarned;
	}
 
}
