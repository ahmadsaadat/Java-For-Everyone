/*
Write a program that reads in three strings and sorts them lexicographically.
Enter three strings: Charlie Able Baker
Able
Baker
Charlie
 */
package p3.pkg16;


import java.util.Scanner;

public class P316 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter three strings: ");
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();

        
        if(str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0){
            String one = str1;
            if(str2.compareTo(str3) < 0){
                String two = str2;
                String three = str3;
                System.out.println("order: "+one+" "+two+" "+three);
            }
            else{
                String two = str3;
                String three = str2;
                System.out.println("order: "+one+" "+two+" "+three);
            }
        }
        if(str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0){
            String one = str2;
            if(str1.compareTo(str3) < 0){
                String two = str1;
                String three = str3;
                System.out.println("order: "+one+" "+two+" "+three);
            }
            else{
                String two = str3;
                String three = str1;
                System.out.println("order: "+one+" "+two+" "+three);
            }
        }
        if(str3.compareTo(str1)<0 && str3.compareTo(str2)<0){
            String one = str3;
            if(str1.compareTo(str2) < 0){
                String two = str1;
                String three = str2;
                System.out.println("order: "+one+" "+two+" "+three);
            }
            else{
                String two = str2;
                String three = str1;
                System.out.println("order: "+one+" "+two+" "+three);
            }
        }
        
       
        
    }
    
}
