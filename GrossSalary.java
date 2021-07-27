/* Q2 Write a program to calculate gross salary from following components
basic salary (in INR), hra (in percentage), da (in percentage), ta (in percentage), pf (in percentage) */

package javaPack;
import java.util.Scanner;

public class GrossSalary {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                
        Scanner sc=new Scanner(System.in);
        
        //Gross Salary=Basic+HRA+DA+ta-PF
        System.out.println("Enter Basic Salary:");
        float basic=sc.nextFloat();

        //allowance
        System.out.println("Enter allowance:");
        float allow= sc.nextFloat();
        
        //HRA= basic* 0.20
        double hra= basic * 0.20;
        
        //DA= Basic* 0.5
        double da=basic * 0.5;
        
        //PF= Basic * 0.11
        double pf= basic* 0.11;
        
        //Gross salary
        double gross=basic+ hra + da + allow - pf;
        
        System.out.println("Gross Salary is::"+ gross);

        sc.close();
                
        }

}
