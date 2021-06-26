package day2;

import java.util.Scanner; 

public class NameChecker {
	static void checkName(String name) throws NameInvalidException 
	{	
		if (name.charAt(0) == 'A')
		{
			throw new NameInvalidException("invalid Name: Name cannot start with capital A");
		}
		
	    else 
	    {
	        System.out.println("Name accepted");
	    }
	}
	
	  public static void main(String[] args) throws NameInvalidException 
	  {  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name : ");
		checkName(sc.nextLine());
		  sc.close();
	  }	
}
