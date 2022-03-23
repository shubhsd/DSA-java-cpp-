// Pattern 10 
// for n = 5
//             * 
//         *       *
//     *               * 
//         *       *
//             *

import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int n_out_space = n / 2;
        int n_inner_space = -1;

        for (int i = 1; i <= n; i++) {
            // System.out.println(n_out_space + ", " + n_inner_space);

            for (int j = 1; j <= n_out_space; j++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int j = 1; j <= n_inner_space; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                n_out_space--;
                n_inner_space += 2;
            } else {
                n_out_space++;
                n_inner_space -= 2;
            }

            System.out.println();
        }
    }
}
