package programs_practice_for_interview;

import java.util.Scanner;

public class Loan_Eligibility {
    public static void main(String[] args) {
        int age;
        double salary;
        int credit_score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your salary");
        salary = sc.nextDouble();
        System.out.println("Enter your credit score");
        credit_score = sc.nextInt();
        if (age >= 18 && age <= 80) {
            System.out.println("You are not eligible for loan");
        }
        else if(salary <= 30000) {
            System.out.println("You are not eligible for loan");
        }
        else if(credit_score >= 650 && credit_score <= 850) {
            System.out.println("You are not eligible for loan");
        }
        else {
            System.out.println("You are eligible for loan");
        }

    }
}
