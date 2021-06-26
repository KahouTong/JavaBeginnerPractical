package extra;

import java.util.Scanner;

public class RemoveExSpace {
	
	public static void main (String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("phrases: ");
		String c = sc.nextLine();
		String result;
		
		result = c.trim().replaceAll("\\s+"," ");
		System.out.println("result = "+ result);
		sc.close();
	}
}
