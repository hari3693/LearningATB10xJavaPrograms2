package OFFICE;

import java.util.Scanner;

public class Base {
    public Integer getId_Card(int integer) {
        Scanner sc = new Scanner(System.in);
        integer = sc.nextInt();
        if (integer == 1111) {
            System.out.println("Scan the ID Card");
        }
        return Id_Card;
    }

    public Boolean setId_Card(Integer id_Card, Boolean Admin) {
       if(Admin) {
           Id_Card = id_Card;
       }
       return false;
    }

    public Boolean getFinger_Print(Boolean Fingerprint) {
        if(Fingerprint) {
            System.out.println("Scan the Finger Print");
        }
        return false;
    }

    public Boolean setFinger_Print(String finger_Print, Boolean Admin) {
           if(Admin) {
               finger_Print = finger_Print;
           }
           return false;
    }

    private Integer Id_Card;

    private String finger_Print;

    public Base(String finger_Print) {
        if (finger_Print.equalsIgnoreCase("Karutdjh1156")) {
            System.out.println("Scan the Finger Print");
        }
        finger_Print = finger_Print;
    }

    public Boolean Wifi_Access(Boolean Password)
    {
        if(Password) {
            System.out.println("Wifi connected sucessfully");
        }
        return false;
    }

    public Boolean System_Access(Boolean Password)
    {
        if(Password) {
            System.out.println("Login is sucessfull");
        }
        return false;
    }

    public Boolean System_Access(Boolean Admin, Boolean Password)  // Method Overloading
    {
        if(Admin && Password) {
            System.out.println("Login is sucessfull");
        }
        return false;
    }

    public Boolean Server_Access(Boolean Admin, Boolean Password)
    {
        if(Admin && Password) {
            System.out.println("Server connected sucessfully");
        }
        return false;
    }

}
