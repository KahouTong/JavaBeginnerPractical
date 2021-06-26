package extra;

import java.util.Scanner;

public class FibonaciSeqChecker {
	
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }

	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to factorial: ");
		int c = sc.nextInt();
		
		System.out.println(isFibonacci(c) ? "yes" :
             "no");
		
		sc.close();
	}
}
