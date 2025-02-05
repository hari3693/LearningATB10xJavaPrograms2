package programs_practice_for_interview;

import java.util.Scanner;

public class Bonus_calculation {
    public static void main(String[] args) {
        float salary;
        float yearsOfExperience;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        salary = sc.nextFloat();
        System.out.println("Enter your years of experience");
        yearsOfExperience = sc.nextFloat();
        float bonus = 0;
        float totalSalary;
        if (yearsOfExperience < 1) {
            totalSalary = salary + bonus;
            System.out.println("total salary with bonus is: " + totalSalary);
        }
        else if (yearsOfExperience > 1 && yearsOfExperience <= 3) {
            bonus = 5 % salary;
            System.out.println(bonus);
            totalSalary = salary + bonus;
            System.out.println("total salary with bonus is: " + totalSalary);
        }
        else if (yearsOfExperience > 3 && yearsOfExperience <= 6) {
            bonus = (10 % salary);
            totalSalary = salary + bonus;
            System.out.println("total salary with bonus is: " + totalSalary);
        }
        else if (yearsOfExperience > 6) {
            bonus = (15 % salary);
            totalSalary = salary + bonus;
            System.out.println("total salary with bonus is: " + totalSalary);
        }
        else {
            System.out.println("No bonus");
        }
    }
}
