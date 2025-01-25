import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+': System.out.println(number1 + number2);
            break;
            case '-': System.out.println(number1 - number2);
            break;
            case '*': System.out.println(number1 * number2);
            break;
            case '/': System.out.println(number1 / number2);
            break;
            case '%': System.out.println(number1 % number2);
            break;
            default:
                System.out.println("Invalid operator");

        }

    }
}
