/*
Write a recursive method public static String reverse(String str) that computes 
the reverse of a string. For example, reverse("flow") should return "wolf". 
Hint: Reverse the substring starting at the second character, then add the first character at the end. 
For example, to reverse "flow", first reverse "low" to "wol", then add the "f" at the end.
 */
package p5.pkg15;

import java.util.Scanner;

public class P515 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter word you would like to reverse");
        System.out.println(reverse(in.next()));
    }
    
    public static String reverse(String str){
        
        int length = str.length();
        
        int i = 1;
        int j = 0;
        
        String reverse = "";
        
        while(i<=length){
            
         reverse = reverse + str.substring(length-i,length-j);
        
          i++; 
          j++;
        }
        
        return reverse;
        
    }

}
