package aggregation;

public class Address {
	private int hno;
	private String city;
	private int pin;
	private Student stud;//Classname variable;has A relationship=aggregation
public Address(int hno,String city,int pin,Student stud)
{
	this.hno=hno;
	this.city=city;
	this.pin=pin;
	this.stud=stud;
}
public void printStudent() 
{
	System.out.println("Name of Student:"+stud.getName());
	System.out.println("Name of Student:"+stud.getRollno());
	System.out.println("House Number:"+hno);
	System.out.println("City:"+city);
	System.out.println("PIN:"+pin);
}

	

}
