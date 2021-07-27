/*Q1 Write a program to calculate simple interest (make sure to take principle amount, interest rate
and time period from console)*/

package javaPack;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        float pa=sc.nextFloat();
        System.out.println("Enter Interest Rate:");
        float ir=sc.nextFloat();
        System.out.println("Enter Time Period (in years):");
        float tp=sc.nextFloat();
        si=(pa*ir*tp)/100;
        System.out.println("simple Interest is::"+ si);

        sc.close();
		
	}

}
