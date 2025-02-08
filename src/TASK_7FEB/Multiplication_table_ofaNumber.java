package TASK_7FEB;

import java.util.Scanner;

public class Multiplication_table_ofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
