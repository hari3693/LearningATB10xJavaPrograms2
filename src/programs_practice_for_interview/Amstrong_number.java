package programs_practice_for_interview;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int adh = 0;
        int rem;
        while (i > 0) {
            rem = i % 10;
            adh = adh + rem * rem * rem;
            i = i / 10;
        }
        if (adh == n) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
