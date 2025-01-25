import java.util.Scanner;

public class km_to_m_and_FH_to_Cg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometers: ");
        int km = sc.nextInt();
        int m = km * 1000;
        //System.out.println("Enter the foreign heat: ");
        //int cg = sc.nextInt();
       System.out.println(m);
    }
}
