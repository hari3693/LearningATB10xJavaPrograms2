import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 5)
        {
            System.out.println("Go to School");
        }
        else
        {
            System.out.println("You are not allowed to School");
        }
    }
}
