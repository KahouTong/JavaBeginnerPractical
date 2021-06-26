package day2tutorial;

import java.io.FileInputStream;

public class ReadRecord {
	public static void main(String args[]) {
		
	    try {
	        FileInputStream record = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\JavaBeginnerPractical\\src\\day2tutorial\\SchoolStudentRecord");	        
	        byte b[] = record.readAllBytes();
	        String name = new String(b);
	        System.out.println(name); 
	        record.close();
	      } 
	    catch (Exception e) 
	    {
	        System.out.println(e);
	      }
	}
}
