import java.util.*;

public class Test2 {
	
	
	public static void main(String args[])
	{
		int num, result;
		Scanner checkOdd = new Scanner(System.in);
		System.out.println("Enter a number to check odd");
		
		num = checkOdd.nextInt();
		
		result = num%2;
		if (result != 0)
		{
			System.out.printf("%d is an odd number",num);
		}
		
		else 
		{
			System.out.printf("%d is an even number",num);
		}
		checkOdd.close();
	}
}
