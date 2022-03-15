// Let say number is  12345 
// o/p should be 
// 1
// 2
// 3
// 4
// 5

import java.util.*;

public class printDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        // Finding divisor

        int div = 1;
        int temp = num;
        while (temp >= 10) {
            temp = temp / 10;
            div *= 10;
        }
        while (div >= 1) {
            int q = num / div;
            int r = num % div;

            System.out.println(q);
            num = r;
            div = div / 10;
        }
    }
}
