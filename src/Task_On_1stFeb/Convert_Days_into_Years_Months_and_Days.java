package Task_On_1stFeb;

import java.util.Scanner;

public class Convert_Days_into_Years_Months_and_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = n;
        int years = i/365;
        System.out.println(years);
        int remainingDays = i%365;
        int months = remainingDays/30;
        System.out.println(months);
        int days = remainingDays%30;
        System.out.println(days);
    }
}
