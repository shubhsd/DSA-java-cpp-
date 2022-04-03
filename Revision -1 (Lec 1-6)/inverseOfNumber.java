import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int p = 1;
        int inv = 0;

        while (num > 0) {
            int q = num / 10;
            int rem = num % 10;

            num = q;

            // r@p -> p@r -> p*pow(10, r-1)
            inv = inv + p * (int) Math.pow(10, rem - 1);
            p++;
        }
        System.out.println(inv);
    }
}
