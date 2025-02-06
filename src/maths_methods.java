import java.util.Scanner;

public class maths_methods {
    static Scanner sc = new Scanner(System.in);
    static int num1 = sc.nextInt();
    static int num2 = sc.nextInt();
    public static int mul(int num1, int num2)
    {
        return num1 * num2;
    }
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public static int sub(int num1, int num2)
    {
        return num1 - num2;
    }
    public static int div(int num1, int num2)
    {
        return num1 / num2;
    }
    public static int modulus(int num1, int num2)
    {
        return num1 % num2;
    }
    public static void main(String[] args) {

       System.out.println(mul(num1,num2));
       System.out.println(add(num1,num2));
       System.out.println(sub(num1,num2));
       System.out.println(div(num1,num2));
       System.out.println(modulus(num1,num2));
    }

}
