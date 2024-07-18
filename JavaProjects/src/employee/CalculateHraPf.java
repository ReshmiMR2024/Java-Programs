package employee;

public class CalculateHraPf extends GetDetails {
	double hra;
	double pf;
	public void calculate()
	{
		hra=(basicpay*5)/100;
		pf=(basicpay*20)/100;
		
	}
	

}
