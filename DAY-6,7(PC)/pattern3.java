
// print pattern

// - - - - *
// - - - * *
// - - * * * 
// - * * * *
// * * * * *

import java.util.*;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int n_of_spaces = n-1; //jitni rows thi usse ek kam tha initially
        int nstars = 1; // pehli row mein sirf ek star tha aur phir increase hua

        // loop for rows
        for(int i = 1; i<=n; i++) {
        // printing spaces first as per pattern 
            for (int j = 1; j<=n_of_spaces; j++) {
                System.out.print(" \t");
            }
            // loop for stars
            for (int j = 1; j<=nstars; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            n_of_spaces--;
            nstars++;
        }
    }
}
