package day1;

class MyNewSchool implements SchoolEmployees, SchoolEmployers{

	@Override
	public void employers1() {
		// TODO Auto-generated method stub
		System.out.println("Chanselor");
	}

	@Override
	public void employees1() {
		// TODO Auto-generated method stub
		System.out.println("teacher");
	}
	
	//overload
	void totalSalary (int num)
	{
		int total = num*2;
		System.out.println("Employee's Salary is "+total);
	}
	
	void totalsalary (long num) 
	{
		long total = num*6;
		System.out.println("Employer's Salary is "+total);
	}
}

//main class
public class MySchool {
	
	  public static void main(String[] args) {
		  
		    MyNewSchool school = new MyNewSchool();
		    school.employees1();
		    school.employers1();
		    school.totalSalary(3000);
		    school.totalsalary(6000);
		  }

	
}


