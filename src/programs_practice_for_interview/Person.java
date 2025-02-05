package programs_practice_for_interview;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        int age;
        boolean status = true;
        boolean visa_status;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your visa status");
        visa_status = sc.nextBoolean();
        if (age >= 18 && status == visa_status) {
            System.out.println("You can travel");
        }
        else {
            System.out.println("You are not eligible to travel");
        }
    }
}
