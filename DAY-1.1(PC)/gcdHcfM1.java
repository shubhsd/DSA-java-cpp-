/**
 * gcdHcfM1
 */

//  Method 1 using for loop

import java.util.*;

public class gcdHcfM1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD/HCF is ");
        System.out.println(gcd);
    }
}