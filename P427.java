/*
Currency conversion. Write a program that first asks the user to type
today’s price for one dollar in Japanese yen, then reads U.S. dollar values 
and converts each to yen. Use 0 as a sentinel.
 */
package p4.pkg27;

import java.util.Scanner;

public class P427 {


    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter todays price for USD/JPY: ");
        double USDJPY = in.nextDouble();
        
        double sentinel = 1;
        
        while(sentinel != 0){
        System.out.println("Amount in USD you'd like to convert to JPY");
        System.out.print("USD: ");
        double USD = in.nextDouble();
        double JPY = USDJPY * USD;
        System.out.print("JPY: "+JPY);
        
        System.out.println("\nTo end program hit 0, if not enter any other number");
        sentinel = in.nextDouble();
        }
    }
    
}
