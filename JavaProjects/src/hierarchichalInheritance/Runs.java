package hierarchichalInheritance;

public class Runs extends Cricket {
	int num;
	
	public void displayrun(int num)
	{
		this.num=num;
		System.out.println("The number of runs:"+num);
		System.out.println("Type:"+type);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runs obj2= new Runs();
		obj2.print("20/20");
		obj2.displayrun(50);
		


		
	}
	

}
