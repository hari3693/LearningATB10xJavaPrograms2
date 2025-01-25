import java.util.Scanner;

public class Switch_example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.nextLine();
        browser = browser.toLowerCase();
        switch (browser) {
            case "firefox":
                System.out.println("Execute the test cases with firefox browser");
                break;
                case "chrome":
                    System.out.println("Execute the test cases with chrome browser");
                    break;
            case "edge":
                System.out.println("Execute the test cases with edge browser");
                break;
                default:
                    System.out.println("Invalid browser");
        }
    }
}
