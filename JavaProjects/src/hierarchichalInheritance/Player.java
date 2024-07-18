package hierarchichalInheritance;

public class Player extends Cricket{
	
	String name;
	int age;
	public void print(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Type:"+type);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player obj1=new Player();
		obj1.print("IPL");
		obj1.print("PAT",24);
		
		

	}

}
