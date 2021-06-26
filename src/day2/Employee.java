package day2;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name; 
	int age; 
	long id;
	transient int salary;
	
	Employee (String name, int age, long id, int salary){
		this.name=name;
		this.age=age;
		this.id=id;
		this.salary=salary;
	}
}


