package OFFICE;

import java.util.Scanner;

public class Junior_Employee extends Base{

    public Junior_Employee(String userid, String password)
    {
        super("Karutdjh1156");
        if (userid.equalsIgnoreCase("uuuuukop"))
        {
            System.out.println("Junior Employee is login sucessfully");
        }
        System.out.println("Junior Employee is allowed to Code and Design if he is login sucessfully");
    }
    public void Designing ()
    {
        System.out.println("Low level designing is allowed");
    }
    public void Coding ()
    {
        System.out.println("module1  is allowed to Code");
    }
    public void Unit_Testing()
    {
        System.out.println("module1  is allowed to Test");
    }
}
