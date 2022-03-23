
// Pattern 17 --- arrow pattern
// for n = 5
//      *	
// 		*	*	
// *	*	*	*	*	
// 		*	*	
// 		*

import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;

        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n / 2; j++) {

                // middle row mein spaces ki jagah stars print hote hai
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "\t");
            }

            System.out.println();

            // stars half tak increment hote hai aur phir decrement
            if (i <= n / 2) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}
