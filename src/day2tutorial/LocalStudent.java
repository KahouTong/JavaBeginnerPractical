package day2tutorial;

import day1.Student;

public class LocalStudent extends Student{

    protected LocalStudent(String name, long matrix) {
		super(name, matrix);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) 
    { 
		LocalStudent newStudent = new LocalStudent("Alice", 161231464);
		System.out.println(newStudent.studentName);
		//System.out.println(newStudent.studentMatrix);
    }
}

