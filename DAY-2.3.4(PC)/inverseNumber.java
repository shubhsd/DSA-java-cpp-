import java.util.*;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int place = 1 ;
        int inv = 0;
        while(num > 0) {
            int rem = num % 10;
            int quo = num / 10;

            num = quo;

            // Note rem @ p -> we need place @ rem -> place * 10^ r-1 
            // place * pow(10, r-1)

            inv = inv + place *   (int)Math.pow(10, rem -1) ;
            place++; 
        }

        System.out.println(inv);
    }
}
