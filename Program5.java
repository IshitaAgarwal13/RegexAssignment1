/* Q: Write a program to take input marks of five subjects and calculate the percentage and display
their division [>=75.00 Distinction, >=60.00 AND <75.00 First division, >=50.00 AND <60.00 Second
division, >=40.00 AND <50.00 Third division, <40.00 Fail]  */

package javaPack;
import java.util.Scanner;

public class DataTypeDemo {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks in 1st Subject:");
        float a=sc.nextFloat();
        System.out.println("Enter Marks in 2nd Subject:");
        float b=sc.nextFloat();
        System.out.println("Enter Marks in 3rd Subject:");
        float c=sc.nextFloat();
        System.out.println("Enter Marks in 4th Subject:");
        float d=sc.nextFloat();        
        System.out.println("Enter Marks in 5th Subject:");
        float e=sc.nextFloat(); 
        
        double per = (a+b+c+d+e)/5;
        
        if(per>=75)
                System.out.println("Distinction");
        else if(per>=60)
                System.out.println("First Division");
        else if(per>=50)
                System.out.println("Second Division");
        else if(per>=40)
                System.out.println("Third Division");
        else
                System.out.println("Fail");
        
        sc.close();
        }

}
