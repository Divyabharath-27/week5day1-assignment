package org.student;

import org.department.Department;

public class student extends Department{
	public void studentName() {
		System.out.println("Divyabharath");
		
	}
	public void studentdept() {
		System.out.println("eee");
	}
	public void studentId() {
		System.out.println("k17ee02");
	}
	public static void main(String[] args) {
		student studentDetails=new student();
		studentDetails.collegeName();
		studentDetails.collegeCode();
		studentDetails.collegeRank();
		studentDetails.departmentName();
		studentDetails.studentName();
		studentDetails.studentdept();
		studentDetails.studentId();
		
	
		
	}

}
