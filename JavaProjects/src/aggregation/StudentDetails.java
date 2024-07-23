package aggregation;

public class StudentDetails {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student student=new Student("Anu",123);
		Address address=new Address(456,"Kochi",6752001,student);
		address.printStudent(); 
		
		

	}

}
