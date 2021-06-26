package day1;

import java.util.Scanner;

public class ClassNumber {
	
	public static void main(String args[])
	{
		int result;
		boolean flag = false;
		
		int classNum[] = new int[10];  
		System.out.println("Enter 5 class number");	
		Scanner classNumber = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
		classNum[i] = classNumber.nextInt();
		}
		
		
		System.out.println("Enter a class number to be search : ");			
		Scanner numberFlag = new Scanner(System.in);
		result = numberFlag.nextInt();
		
		for (int i =0; i<5; i++) {			
		if (classNum[i]==result  )
		{
			flag = true;
		}
		
		}
		
		if (flag == true)
		{
			System.out.printf("%d is in list entered",result);
		}
		
		else 
		{
			System.out.printf("%d is not in list entered",result);
		}
		
		numberFlag.close();
		classNumber.close();
	}
}
