package extra;

import java.util.Scanner; 

public class Factorial {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to factorial: ");
		int c = sc.nextInt();
		int result = 1;
		for(int j = 0; j<c;j++) {
			result = (c-j)*result;
		}
		System.out.println("result = "+result);
		sc.close();
	}
}
