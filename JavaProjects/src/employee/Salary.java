package employee;

public class Salary extends CalculateHraPf{
	double finalsalary;
	public void getSalarySlip()
	{
		finalsalary=(basicpay+hra-pf-deduction+bonus);
		System.out.println(" Basic pay "+basicpay); 
		System.out.println(" HRA "+hra);
		System.out.println(" Bonus "+bonus);
		System.out.println(" Total Salary"+finalsalary);
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary obj=new Salary();
		obj.get(1000.25, 250, 200);
		obj.calculate();
		obj.getSalarySlip();

	}

}
