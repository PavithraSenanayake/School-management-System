package com.SchoolManagementSyatem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String []args) {
		
		Teacher ann = new Teacher(1,"Ann",5000);
		Teacher luzzy = new Teacher(2,"Luzzy",8000);
		Teacher sofy = new Teacher(3,"Sofi",10000);
		
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(ann);
		teacherList.add(luzzy);
		teacherList.add(sofy);
		
		Student tom = new Student(1,"Tom",4);
		Student john = new Student(2,"John",12);
		Student jack = new Student(3,"Jack",6);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tom);
		studentList.add(john);
		studentList.add(jack);
		
		School hs = new School(teacherList,studentList);
		Teacher lewis = new Teacher(3,"Lewis",9000);
		hs.addTeachers(lewis);
		
		tom.payFees(5000);
		john.payFees(10000);
		System.out.println("hs has earned "+hs.getTotalMoneyEarned());
		
		System.out.println("-------------------- PAY SALARY------------------");
		ann.receiveSalary(ann.getSalary());
		System.out.println("hs has spaent for salary to "+ann.getName() + " and now have "+hs.getTotalMoneyEarned());
		
		ann.receiveSalary(luzzy.getSalary());
		System.out.println("hs has spaent for salary to "+luzzy.getName() + " and now have "+hs.getTotalMoneyEarned());
			
		System.out.println(tom);
		
		luzzy.receiveSalary(luzzy.getSalary());
		System.out.println(luzzy);
		}
		
		

}
