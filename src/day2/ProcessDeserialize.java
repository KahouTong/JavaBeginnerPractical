package day2;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ProcessDeserialize {
	public static void main (String args[]) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\JavaBeginnerPractical\\src\\day2\\Employee.txt"));
		Employee firstEmployee = (Employee)in.readObject();
		System.out.println(firstEmployee.name+" "+firstEmployee.age+" "+firstEmployee.id+" "+firstEmployee.salary);
		in.close();
	}
}
