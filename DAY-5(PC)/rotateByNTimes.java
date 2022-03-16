// eg: rotate by 2 for 975432 should give 329754

import java.util.*;

public class rotateByNTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int rotations = scn.nextInt();

        // Finding number of digits

        int nod = 0; //Initial digits = 0
        int temp = num;
        while(temp!=0) {
            temp = temp/10;
            nod++;
        }

        // Special case 1 - finding rotations to be done for large rotation value (To avoid repetition)

        rotations = rotations % nod;
        // line above will prevent from making extra rotations eg: for 105 rotations of 5 digit number we will get original 
        // number after every 5 rotation and next rotations after 5 will repeat itself.

        // Special case 2 - Negative rotations

        // As we saw that negative rotation will also be similar so one + rotation 
        if(rotations<0) {
            rotations = rotations + nod ;
        }

        // Finding div and multiplier

        // Method 1 - using pow function 

        // int div = (int)Math.pow(10, k);
        // int mult = (int)Math.pow(10, nod-k);

        // Method 2 - Using for loop

        int div = 1;
        int mult = 1;

        for(int i = 1; i<=nod; i++) {
            if(i<=rotations) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int q = num / div;
        int r = num % div;

        int ans = r * mult + q;
        System.out.println(ans);
    }
}
