/*
In the United States there is no federal sales tax, so every state may impose its own
sales taxes. Look on the Internet for the sales tax charged in five U.S. states, then
write a program that prints the tax rate for five states of your choice.
Sales Tax Rates
---------------
Alaska: 0%
Hawaii: 4%
 */
package p1.pkg19;

public class P119 {

    public static void main(String[] args) {

        double Tennessee = 9.46;
        double Illinois = 8.73;
        double Nebraska = 6.89;
        double Iowa = 6.82;
        double Alaska = 1.43;
        
        System.out.printf("Tennessee: %3.2f%%", Tennessee);
        System.out.printf("\nIllinois: %3.2f%%", Illinois);
        System.out.printf("\nNebraska: %3.2f%%", Nebraska);
        System.out.printf("\nIowa: %3.2f%%", Iowa);
        System.out.printf("\nAlaska: %3.2f%%", Alaska);
        
        
    }
    
}
