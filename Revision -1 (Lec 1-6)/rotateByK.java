import java.util.Scanner;

public class rotateByK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int place = scn.nextInt();

        // FInding number of digits
        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        place = place % nod;

        if(place<0) {
            place = place+nod;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= place) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }
        int q = num / div;
        int rem = num % div;
        int ans = rem * mult + q;
        System.out.println(ans);

    }
}
