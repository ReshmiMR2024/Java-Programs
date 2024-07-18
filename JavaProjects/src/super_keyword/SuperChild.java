package super_keyword;

public class SuperChild extends ParentSuper{
	int number;
	public SuperChild(int num)
	{
		number=num;
	    super.number=num;
	    //display();
	    //super.display();
	}
	
	public void display()
		{
		super.display();
		System.out.println("Child class Number:"+number);
		System.out.println("Parent Number:"+super.number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild(100);
		obj.display();
		//obj.displayChild();

	}

}
