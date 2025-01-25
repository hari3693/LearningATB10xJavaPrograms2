import java.util.Scanner;

public class For_loop_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Fac = 1;
        for (int i = 1; i<=n ; i++) {
            Fac = Fac*i;
        }
        System.out.println(Fac);
    }
}