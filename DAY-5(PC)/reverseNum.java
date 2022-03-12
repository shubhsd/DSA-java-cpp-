
import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while(num !=0) {
            int quo = num / 10;
            int rem = num % 10;

            System.out.println(rem);

            num = quo;
        }
    }
}
