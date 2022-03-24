
// Pattern 20 --- W pattern
// for n = 5

// *				*	
// *				*	
// *		*		*	
// *	*		*	*	
// *				*

import java.util.*;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // First and last column
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if ((i == j || i + j == n + 1) && (i > n / 2)) {
                    // na first na last i.e 2nd half ke diagonal
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
