package mulitilevelinheritance;

public class Third extends Second{
	public void thirdmethod()
	{
	System.out.println("Second method");
	Secondmethod("Reshmi");
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Third obj=new Third();
		obj.firstmethod(10,20);
		obj.thirdmethod();

	}

}
