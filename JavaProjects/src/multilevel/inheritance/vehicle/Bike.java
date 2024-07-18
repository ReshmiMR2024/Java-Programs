package multilevel.inheritance.vehicle;

public class Bike extends Car{
	String  speed;
	public void bikeDetails(String name,String speed)
	{
		this.name=name;
		this.speed=speed;
	System.out.println("Name:" +name);
	System.out.println("Brand:" +brand);
	System.out.println("Speed:" +speed);
	System.out.println("Capacity:"+capacity);
	System.out.println("Type"+type);
	}
	
	public static void main(String[] args)
	{
		Bike obj=new Bike();
		obj.vehicleDetails("Four wheeler");
		obj.carDetails("Ford","7");
		obj.bikeDetails("Ninja","4005");
	
	}
	

}
