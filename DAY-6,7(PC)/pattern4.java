
// pattern - 

// * * * * *
// - * * * *
// - - * * * 
// - - - * * 
// - - - - *

import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = 0; // pehli bar spaces 0 the
        int nst = n; // pehli baar stars row ke barabar the

        // now all stars first then spaces

        for (int i = 1; i <= n; i++) {

            // printing spaces first
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            // printing stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            nst--;
            nsp++;
        }

    }
}
