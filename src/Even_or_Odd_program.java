import java.util.Scanner;

public class Even_or_Odd_program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }
}
