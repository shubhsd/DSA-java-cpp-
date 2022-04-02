import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int div = 2;
        boolean isPrime = true;

        while(div*div <=num) {
            if(num%div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        if(isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " not prime");
        }
    }
}
