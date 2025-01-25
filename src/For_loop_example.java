import javax.swing.*;
import java.util.Scanner;

public class For_loop_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n; i++) {
            if (i % 2 == 0) {
                System.out.println("The even number is " + i);
                continue;
            } else {
                System.out.println("The Odd number is" + " " + i);
            }
        }
    }
}
