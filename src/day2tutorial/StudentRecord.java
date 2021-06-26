package day2tutorial;

import java.io.FileOutputStream;

public class StudentRecord {
	public static void main(String args[]) {
		
	    try 
	    {
	    	//set the boolean to true FileOutputStream(File file, boolean append)
	        FileOutputStream record = new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\JavaBeginnerPractical\\src\\day2tutorial\\SchoolStudentRecord",true);
	        String name = "Joey";
	        byte b[] = name.getBytes();
	        record.write(10); //decimal value 10 represents newline in ASCII
	        record.write(b);
	        record.close();
	        System.out.println("Data recorded"); 
	    } 
	    catch (Exception e) 
	    {
	        System.out.println("An error occurred.");
	    }
	}
}
