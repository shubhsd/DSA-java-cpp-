
// pattern - 6

// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*

import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = n / 2; // pehli bar spaces n/2 the eg: for n = 5 space = 5/2 = 2 int value
        int nst = 1; // pehli baar stars 1 tha

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

            if (i <= n / 2) {
                nsp = nsp - 1;
                nst = nst + 2;
            } else {
                nsp = nsp + 1;
                nst = nst - 2;
            }
        }
    }
}
