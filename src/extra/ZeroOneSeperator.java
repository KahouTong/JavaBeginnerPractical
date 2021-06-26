package extra;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroOneSeperator {

	public static void main (String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Zero One Separator: ");
		String c = sc.nextLine();
		int arr[] = new int[c.length()];
		int result[];
		for(int j = 0; j<c.length();j++) {
			arr[j] = Character.getNumericValue(c.charAt(j)); 
		}
		
		result = seperator(arr);
		System.out.println("result = "+ Arrays.toString(result));
		sc.close();
	}
	
	static int [] seperator (int arr[]) {
		int count = 0;
		for (int i=0; i<arr.length;i++) {
			if (arr[i] == 0)
			count++;
		}
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        for (int i = count; i < arr.length; i++)
            arr[i] = 1;
		return arr;
	}
}