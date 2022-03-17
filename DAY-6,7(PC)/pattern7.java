
// pattern - 7

// *	
//  	*	
//          *
//              *	
//                  *
// This is simple slash, bass spaces ka game hai

import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = 0; // pehli bar spaces / row mein 0 space the pehle
        int nst = 1; // star pehli baar 1 hai aur humesha 1 rhega

        // now all stars first then spaces

        for (int i = 1; i <= n; i++) {

            // printing spaces first
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            // printing stars
            System.out.print("*\t");
            System.out.println();

            nsp++;
        }
    }
}
