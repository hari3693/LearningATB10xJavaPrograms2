import java.util.Scanner;

public class For_loop_Reverse_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
            for (int i= b.length()-1 ; i>=0 ; i--) {
                System.out.print(b.charAt(i));
            }
    }
}