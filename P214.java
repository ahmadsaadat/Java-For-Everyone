/*
Write a program that reads a number between 1,000 and 999,999 from the user and
prints it with a comma separating the thousands. Here is a sample dialog; the user
input is in color:
Please enter an integer between 1000 and 999999: 23456
23,456
 */
package pkg2.pkg14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer between 1000 and 999999: ");

        String number = in.next();
        int intnumber = Integer.parseInt(number);

        System.out.printf("%,d", intnumber);

    }
}
