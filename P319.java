/*
Write a program that reads in two floating-point numbers and tests whether they are
the same up to two decimal places. Here are two sample runs.
Enter two floating-point numbers: 2.0 1.99998
They are the same up to two decimal places.
Enter two floating-point numbers: 2.0 1.98999
They are different
 */
package pkg3.pkg19;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   
   System.out.println("Enter two floating point numbers: ");
   double num1 = in.nextDouble();
   double num2 = in.nextDouble();
   
   double num1times100 = num1*100;
   double num2times100 = num2*100;
   
   double roundnum1 = Math.round(num1times100);
   double roundnum2 = Math.round(num2times100);
   
   double num1divide100 = roundnum1/100;
   double num2divide100 = roundnum2/100;
   
   if(num1divide100 == num2divide100){
       System.out.println("They are the same up to two decimal places.");
   }
   else{
       System.out.println("They are different");
   }
   
   
   
        
        
    }
    
}
