import java.util.*;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for(int f = 2; f*f<=num; f++) {
            while(num % f == 0) {
                System.out.print(f + " ");
                num = num / f;
            }
        }

        if(num > 1) {
            System.out.println(num);
        }
    }
}
