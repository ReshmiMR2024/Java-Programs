package superkeyword;

public class Child extends Parent{
	
	public Child()
	
	
	{
		super(10);
		//super();//immediate parent class
	
		System.out.println("Child class Constructor");
	}
	public void childmethod()
	{
		System.out.println("Child class method"); 
	}
	


public static void main (String[] args)
{
	Child obj=new Child(120);
	obj.parentmethod();
	obj.childmethod();
}
}

