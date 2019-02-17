/*
A supermarket wants to reward its best customer of each day, 
showing the customer’s name on a screen in the supermarket. 
For that purpose, the customer’s purchase amount is stored in an ArrayList<Double>
and the customer’s name is stored in a corresponding ArrayList<String>. 
Implement a method public static String nameOfBestCustomer(ArrayList<Double> sales,       
ArrayList<String> customers) that returns the name of the customer with the largest sale. 
Write a program that prompts the cashier to enter all prices and names, adds them to two array lists, 
calls the method that you implemented, and displays the result. Use a price of 0 as a sentinel
 */
package p6.pkg30;

import java.util.*;

public class P630 {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
        
        ArrayList<Double> Sales = new ArrayList<Double>();
        ArrayList<String> Name = new ArrayList<String>();
        
        
       
        int i = 0;
       

        System.out.println("enter 0 in 'Total Sales for this customer' to end program\n\n");
            
         System.out.println("Name of Customer making purchase: "); Name.add(in.next());
         
         System.out.println("Total Sales for this customer: "); Sales.add(in.nextDouble());
            
         
         

        while(Sales.get(i) != 0){
         
         i++;
         
            
         System.out.println("Name of Customer making purchase: "); Name.add(in.next());
         
         System.out.println("Total Sales for this customer: "); Sales.add(in.nextDouble());
         
                
                 
        }
        
        
        System.out.println("Name of largest sale customer:" + nameOfBestCustomer(Sales,Name));
        
    }
    
    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){
        
        int i = 0;
        double max = 0;
        int maxindex = 0;
        
        while(i < sales.size()){
            
            if(sales.get(i) > max){
                
                
                max = sales.get(i);
                maxindex = i;
                i++;
                
            }
            else{
                
                i++;
            }
            
            
            
        }
        
        
     return customers.get(maxindex);   
    }
    
}
