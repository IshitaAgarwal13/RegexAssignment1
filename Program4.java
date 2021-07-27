// Q: Write a program to take four values and display maximum and minimum among them

package javaPack;
import java.util.Scanner;

public class DataTypeDemo {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd value:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd value:");
        int c=sc.nextInt();
        System.out.println("Enter 4th value:");
        int d=sc.nextInt();        
        
        int max,min;
        max = (a>b)?((a>c)?(a>d?a:d):(d>c?d:c)):((b>c)?(b>d?b:d):(d>c?d:c));
        min = (a<b)?((a<c)?(a<d?a:d):(d<c?d:c)):((b<c)?(b<d?b:d):(d<c?d:c));
        
        System.out.println("Max is:: "+ max );
        System.out.println("Min is:: "+ min );   
        sc.close();       
        }

}
