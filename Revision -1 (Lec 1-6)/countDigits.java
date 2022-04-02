import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int dig = 0;
        while(num!=0) {
            int quotient = num/10;
            num = quotient;
            dig++;
        }
        System.out.println(dig);
    }
}
