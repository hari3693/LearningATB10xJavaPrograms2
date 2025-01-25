import java.util.Scanner;

public class While_loop_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        while (age < 100) {
            System.out.println("You are not an adult yet");
            age++;
        }
        System.out.println("You are an adult");
    }
}
