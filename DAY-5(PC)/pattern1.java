
// print pattern 

// *
// * *
// * * *
// * * * *

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // loop for number of lines /rows

        for(int i = 1; i<=n; i++) {
            // inner loop to print *

            for(int j = 1; j<=i; j++) {
                System.out.print("*\t");
            } 
            // to enter into new line
            System.out.println();
        }
    }   
}
