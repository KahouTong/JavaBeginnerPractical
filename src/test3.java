
public class test3 {

	public static void main(String args[])
	{
		int list[]= {2,1,3,4,5,10,-10};
		int temp,min;

		temp = list[0];
		min = list[0];
		for (int i =0; i < list.length; i++) {

			if (list[i]<min)
			{
				min = list[i];
			}
			else 
			{
				temp=list[i];
			}
		}
		
		System.out.println("minimum :"+min);
		System.out.println("maximum :"+temp);
		
	}
}
