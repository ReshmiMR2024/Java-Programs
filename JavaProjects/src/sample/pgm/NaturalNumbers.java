package sample.pgm;
import java.util.*;
public class NaturalNumbers {
    
        public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the limit");
    	int num=sc.nextInt();    	
    	NaturalNumbers numbers = new NaturalNumbers();
    	System.out.println("Debugging..");
    	numbers.printNumbers(num);
    	System.out.println("");
    	
    }
}
