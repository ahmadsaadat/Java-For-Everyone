/*
Write a program that asks the user to input
• The number of gallons of gas in the tank
• The fuel efficiency in miles per gallon
• The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas in the tank.
 */


package p2.pkg11;

import java.util.Scanner;

public class P211 {


    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    System.out.printf("Number of gallons of gas in the tank? \n");
    double gasTank = in.nextDouble();
    System.out.printf("Fuel efficiency of car, miles per gallon? \n");
    double mpg = in.nextDouble();
    System.out.printf("Price of gas per gallon? \n");
    double pricePerGallon = in.nextDouble();
    
    double cost = (100/mpg)*pricePerGallon;
    System.out.printf("gas cost per 100 mile = %.2f \n", cost);
    
    double range = gasTank*mpg;
    System.out.printf("your car range is = %.2f \n", range);
    
    
        
        
    }
    
}
