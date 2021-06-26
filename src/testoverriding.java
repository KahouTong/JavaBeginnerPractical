class cars //parent
{
	public void model() 
	{
		System.out.println("proton");
		
	}
}

class bmw extends cars{
	public void model()
	{
		System.out.println("bmw");
	}
}


public class testoverriding{
	public static void main(String args[])
	{
		bmw b1 = new bmw();
		b1.model();
	}
}
