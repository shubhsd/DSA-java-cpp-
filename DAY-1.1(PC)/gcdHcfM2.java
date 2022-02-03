// Using while loop and if statement

import java.util.*;

public class gcdHcfM2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number (Method 2)");
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();

        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
                // Means num1 = num2-num1
            } else {
                num2 -= num1;
                // Means num1 = num1-num2
            }
        }
        System.out.println("GCD: " + num1);
    }
}
