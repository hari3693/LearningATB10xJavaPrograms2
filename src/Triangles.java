import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int n1 = sc.nextInt();
        System.out.println("Enter the side2");
        int n2 = sc.nextInt();
        System.out.println("Enter the side3");
        int n3 = sc.nextInt();
        if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
            System.out.println("Invalid input : The sides of the Triangle should be positive");
        }
        else if (n1 == n2 && n1 == n3) {
            System.out.println("Equilateral Triangle");
        }
        else if (n1 == n2 || n2 == n3 ) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }

}
