package programs_practice_for_interview;

import java.util.Scanner;

public class Electric_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units = sc.nextInt();
        double bill = 0;
        if(units<=100){
            bill = units*0.50;
        }
        else if(units>101 && units <= 200){
            bill = 100*0.50+(units-100)*0.75;
        }
        else if(units>201 && units <= 300){
            bill = 100*0.50+(units-100)*0.75+(units-200)*1.20;
        }
        else if(units>301){
            bill = 100*0.50+(units-100)*0.75+(units-200)*1.20+(units-300)*1.50;
        }
        System.out.println("The bill amount is: "+bill);
    }
}
