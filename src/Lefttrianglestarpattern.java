import java.util.Scanner;

public class Lefttrianglestarpattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Your number is" + " " + n);

        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=n-i; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }


    }

}
