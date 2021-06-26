package day3;

import java.util.regex.*;

public class StudentAccountValidation {
	public static void main(String args[]) {
		String username = "TongKaHou";
		String myUsername = "TongKaHou";
		
		boolean compare = Pattern.matches(myUsername,username);
		if (compare)
		System.out.println("username matched");
		
		else
		System.out.println("username is not matched");
	}
}
