package extra;

import java.util.Scanner;

public class DetectVowel {
	
	public static void main (String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		String c = sc.nextLine();
		int result;
		
		result = vowelCheck(c);
		System.out.println("detected vowel = "+result);
		sc.close();
	}
	
	static int vowelCheck(String c) {
		int count = 0;
		for (int i = 0; i<c.length();i++) {
			if (c.charAt(i)=='a'|| c.charAt(i)=='e'|| c.charAt(i)=='i'|| c.charAt(i)=='o'|| c.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}

}
