package inheritance;

public class Child  extends Parent{
	public void childmethod()
	{
		System.out.println("Child Class");
		number=number+8;
		System.out.println("Parent method number in child metod"+number);
	}
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.parentmethod(5);
		obj.childmethod();

	}

}
