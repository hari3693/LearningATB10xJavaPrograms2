package OFFICE;

import java.util.Scanner;

public class Senior_Employee extends Base{

    public Senior_Employee(String userid, String password)
    {
        super("nnsdlkmc");
        if (userid.equalsIgnoreCase("Janihnds"))
        {
            System.out.println("Senior Employee is login sucessfully");
        }
        System.out.println("Senior Employee is allowed to Code and Design if he is login sucessfully");
    }

    public void Environment_setup () {
            System.out.println("Environment setup sucessfull");
    }
        public void Coding ()
        {
            System.out.println("Critical module  is allowed to Code");
        }
        public void Designing ()
        {
            System.out.println("High level designing is allowed");
        }
    }

