package Task_On_1stFeb;

import java.util.Scanner;

public class Check_website_based_on_Domain {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String str = sc.nextLine();
        if(str.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(str.endsWith(".org")){
            System.out.println("Organisation website");
        }
        else if(str.endsWith(".edu")){
            System.out.println("Education website");
        }
        else
        {
            System.out.println("Invalid website");
        }
    }
}
