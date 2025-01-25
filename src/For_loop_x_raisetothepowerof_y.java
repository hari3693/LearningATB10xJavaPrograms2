import java.util.Scanner;

public class For_loop_x_raisetothepowerof_y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1: ");
        int n = sc.nextInt();
        System.out.println("Enter the number n2: ");
        int n2 = sc.nextInt();
        int Sum = 1;
        for (int i = 1; i <= n2; i++) {
            Sum = Sum * n;
        }
        System.out.println(Sum);
    }
}
