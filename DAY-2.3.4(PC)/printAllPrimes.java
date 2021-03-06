// Print all prime numbers between a and b

import java.util.*;

public class printAllPrimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) {
            boolean isPrime = true;

            int div = 2;
            while (div * div <= n) {
                int rem = n % div;

                if (rem == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.print(" " + n);
            }
        }
    }
}
