import java.util.Scanner;

public class For_loop_Calculate_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n ; n--) {
            sum = sum + n;
        }
        System.out.println(sum);

    }
}
