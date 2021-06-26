package day3;


interface OutputName{
	void outputName();
	//void compare();
}

@FunctionalInterface 
interface OutputMatrix{
	void outputMatrix();
}

//abstract class with one abstract method and non abstract method
abstract class Name{
	abstract void nickName();
	void parentName() {
		String name = "Alice";
		System.out.println("Parent is "+name);
	}
}

//abstract class should use extend keyword, interface should use implement keyword
public class StudentProfile extends Name implements OutputName, OutputMatrix{

	@Override
	public void outputMatrix() {
		// TODO Auto-generated method stub
		long matrix = 123456789;
		System.out.println("Matrix Number is "+matrix);
	}

	@Override
	public void outputName() {
		// TODO Auto-generated method stub
		String name = "Bob";
		System.out.println("Student is "+name);
	}

	@Override
	void nickName() {
		// TODO Auto-generated method stub
		String nickName = "Bill";
		System.out.println("Student nickname is "+nickName);
	}
	public static void main(String[] args) { 
		StudentProfile student = new StudentProfile();
		student.outputName();
		student.outputMatrix();
		student.nickName();
	}	

}
