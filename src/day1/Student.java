package day1;

public class Student {
	
	protected String studentName;
	String addr;
	private long studentMatrix;
	
	//constructor
	protected Student(String name, long matrix){
		studentName = name;
		studentMatrix = matrix;
	}
		
	public static void main (String args[]) {
	    Student myStudent = new Student("TongKaHou", 123456789);
	    System.out.println("Name : "+myStudent.studentName);
	    System.out.println("Matrix : "+myStudent.studentMatrix);
	}
}

