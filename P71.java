/*
Write a program that carries out the following tasks: Open a file with the name hello.txt. 
Store the message “Hello, World!” in the file. Close the file. Open the same file again. 
Read the message into a string variable and print it. 
 */
package p7.pkg1;

import java.io.*;
import java.util.*;


public class P71 {


    public static void main(String[] args) throws FileNotFoundException {


        PrintWriter out = new PrintWriter("hello.txt");
        
        out.write("Hello, World!");
        
        out.close();

        File inputFile = new File("hello.txt");
        Scanner in = new Scanner(inputFile);
        
        System.out.println(in.nextLine());
        
        
        
        
        
        
    }
    
}
