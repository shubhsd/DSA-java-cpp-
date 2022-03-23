
// Pattern 19 --- Swastik pattern
// for n = 5

// *	*	*       *
//          *       *
// *    *   *   *   *
// *        * 
// *        *   *   * 

import java.util.*;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    // 1st half and last
                    if (j <= n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else if (i <= n / 2) {
                // middle and last
                for (int j = 1; j <= n; j++) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else if (i == n / 2 + 1) {
                // middle row
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            } else if (i < n) {
                // middle and 1st
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else {
                // 1st and 2nd half
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
