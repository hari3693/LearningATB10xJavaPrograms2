import java.util.Scanner;

public class Grade_scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("A");
        }
        else if (n >= 80 && n <= 89) {
            System.out.println("B");
        }
        else if (n >= 70 && n <= 79) {
            System.out.println("C");
        }
        else if (n >= 60 && n <= 69) {
            System.out.println("D");
        }
        else if (n <= 0 || n > 100) {
            System.out.println("Out of range");
        }
        else {
            System.out.println("F");
        }
    }
}
