// count digits in number

import java.util.*;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int digits = 0;

        while(num != 0) {
            int quotient = num / 10;

            digits++;
            num = quotient;
        }
        System.out.println(digits);
    }
}
