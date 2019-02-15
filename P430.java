/* 
Write an application to pre­sell a limited number of cinema tickets. 
Each buyer can buy as many as 4 tickets. No more than 100 tickets can be sold. 
Implement a program called TicketSeller that prompts the user for the desired number of tickets and then displays the number of remaining tickets. 
Repeat until all tickets have been sold, and then display the total number of buyers.
 */
package p4.pkg30;

import java.util.Scanner;

public class P430 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tickets = 100;
        int buyer = 0;
        
        while(tickets>0){
         System.out.println("How many tickets do you want?");
            int howmany = in.nextInt();   
            
            
            if( howmany > 96){
            
            System.out.println("Sorry each buyer can only buy up to 4 tickets");
            
            }
            else{
             
             buyer++;
             System.out.println("You have bought "+howmany+" amount of tickets");
             tickets = tickets - howmany;
             System.out.println("Remaining amount of tickets are "+tickets);
                
            }
                      
            
        }
        
        System.out.println("Total amount of buyers = "+buyer);
    }
    
}
