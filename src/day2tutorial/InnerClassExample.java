package day2tutorial;

class Student{
	
	private String name = "Alice";	
	class PersonalProfile{
		void Record() {
			System.out.println("My Name is "+name);
		}
	}
}

public class InnerClassExample {
	public static void main (String args[]) {
		Student newStudent = new Student();
		Student.PersonalProfile studentName = newStudent.new PersonalProfile();
		studentName.Record();
	}
}
