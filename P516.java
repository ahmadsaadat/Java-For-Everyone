/*
Write a recursive method public static boolean isPalindrome(String str) that returns true if str is a palindrome, 
that is, a word that is the same when reversed. Examples of palin drome are “deed”, “rotor”, or “aibohphobia”. Hint: 
A word is a palindrome if the first and last letters match and the remainder is also a palindrome.
 */
package p516;

import java.util.Scanner;



public class P516 {

    
    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        System.out.println("Enter word you would like to reverse");
        System.out.println(isPalindrome(in.next()));
    }
    
    public static boolean isPalindrome(String str){
        
        int length = str.length();
        
        int i = 1;
        int j = 0;
        
        String reverse = "";
        
        while(i<=length){
            
         reverse = reverse + str.substring(length-i,length-j);
        
          i++; 
          j++;
        }
        
        if(reverse.equals(str)){
            
            return true;
        }
        else{
        
        return false;
    }
        
    }
    }
    

