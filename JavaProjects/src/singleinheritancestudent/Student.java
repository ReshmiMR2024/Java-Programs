package singleinheritancestudent;

public class Student {
	String name;
	int number;
	public void parentmethod(String name,int number)
	{
		this.name=name;
		this.number=number;
		System.out.println("Parent Class");
		System.out.println("Student name in parent method:"+name);
		System.out.println("Student RollNumber in parent method:"+number);
		
		
	}
	

}
