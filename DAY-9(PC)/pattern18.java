
// Pattern 18 --- Hour glass pattern
// for n = 7
// *	*	*	*	*	*	*	
//  	*				*	
// 		    *		*	
// 			    *	
// 		    *	*	*	
//  	*	*	*	*	*	
// *	*	*	*	*	*	*

import java.util.*;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = 0;
        int nst = n;

        for (int i = 1; i <= n; i++) {
            // for spaces
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            // for stars
            for (int j = 1; j <= nst; j++) {
                if (i > 1 && i <= n / 2) {
                    if (j == 1 || j == nst) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("*\t");
                }
            }

            if (i <= n / 2) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }
    }
}
