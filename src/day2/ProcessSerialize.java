package day2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProcessSerialize {
	public static void main (String args[]) {
	    try 
	    {
	        FileOutputStream record = new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\JavaBeginnerPractical\\src\\day2\\Employee.txt");
	        Employee firstEmployee = new Employee("TongKaHou",25,123456,3000);
	        ObjectOutputStream out = new ObjectOutputStream(record);
	        out.writeObject(firstEmployee);
	        out.flush();
	        out.close();
	        record.close();
	        System.out.println("Data recorded"); 
	    } 
	    catch (Exception e) 
	    {
	        System.out.println(e.toString());
	    }
	}
}
