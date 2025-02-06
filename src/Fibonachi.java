import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(first);
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;

        }
    }
}
