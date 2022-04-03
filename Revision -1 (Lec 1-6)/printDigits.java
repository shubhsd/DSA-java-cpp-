import java.util.Scanner;

public class printDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int div = 1;
        int temp = num;
        while (div >= 10) {
            temp = temp / 10;
            div *= 10;
        }
        // System.out.println(div);

        while (div >= 1) {
            int q = num / div;
            int rem = num % 10;

            System.out.println(q);
            num = rem;
            div = div / 10;
        }
    }
}
