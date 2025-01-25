import java.util.Scanner;
import java.io.*;
public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age>=60? "Eligible for pension" : "Not Eligible for pension");

    }
}
