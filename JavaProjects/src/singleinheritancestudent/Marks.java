package singleinheritancestudent;

import inheritance.Child;

public class Marks extends Student {
	int mark1,mark2;
	public void childmethod(int m1,int m2)
	{
		mark1=m1;
		mark2=m2;
		System.out.println("Child Class");
		System.out.println("Mark1 in child method"+mark1);
		System.out.println("Mark2 in child method"+mark2);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks obj=new Marks();
		obj.parentmethod("Anu",90);
		obj.childmethod(20,30);

	}
	
	
	
	
	
	
	

}
