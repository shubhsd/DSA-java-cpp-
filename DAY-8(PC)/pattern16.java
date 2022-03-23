
// Pattern 16
// for n = 7
// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1

import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = 2 * n - 3;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=stars; j++) {
                System.out.print(j + "\t");
            }

            for(int j = 1; j<=spaces; j++) {
                System.out.print("\t");
            }

            if(i==n) {
                stars--;
            }

            for(int j = stars; j>=1; j--) {
                System.out.print(j + "\t");
            }

            System.out.println();
            stars++;
            spaces -=2;
        }
    }
}
