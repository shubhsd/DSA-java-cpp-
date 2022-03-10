import java.util.*;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int p = 1;
        while (p <= num) {
            int rem = p % 2;

            if (rem == 0) {
                System.out.println( p + " is Even");
            } else {
                System.out.println(p + " is Odd");
            }
            p++;
        }
        System.out.println("Out of the loop");
    }
}
