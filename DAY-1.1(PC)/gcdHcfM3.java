
// GCD for both positive and negative number
import java.util.*;

public class gcdHcfM3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number (Method 3)");
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();

        // Always set to positive
        num1 = (num1 > 0) ? num1 : -num1;
        num2 = (num2 > 0) ? num2 : -num2;

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
