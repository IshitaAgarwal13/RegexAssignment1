// Q: Write a program to check whether the given year is leap year or not?


import java.util.Scanner;
class LeapYear{
        public static void main(String args[]){
            String result=" ";
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter any year");    
            int year=sc.nextInt();
            sc.close();
            if(year%100==0){
                 if(year%400==0)
                    result="leap year";
                 else
                    result="not a leap year";

            }
            else{
                 if(year%4==0)
                     result="leap year";
                 else
                     result="not a leap year";    
            }
           System.out.println(result); 
        }
}
