
public class Test {
	

	double num3;
	//overloading with multiple method
	void multiply (int num1, int num2)
	{
		num3 = num1 *num2;
		System.out.println("overloading 1st result is "+num3);
		
	}
	
	void multiply (double num1, double num2) 
	{
		num3 = num1 *num2;
		System.out.println("overloading 2nd result is "+num3); 
	}

	
	public static void main(String args[])
	{
		int odd;
		Test number = new Test();
		number.multiply(2, 2);
		number.multiply(2.2, 2.2);
	
		//task 2
		for(int i=1;i<=225;i++) 
		{
			odd = i%2;
			if (odd != 0)
			{
				System.out.println(+i);
			}
	}
	
	}
}
