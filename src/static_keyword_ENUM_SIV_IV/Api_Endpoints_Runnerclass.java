package static_keyword_ENUM_SIV_IV;

import java.io.FileInputStream;

public class Api_Endpoints_Runnerclass {
    public static void main(String[] args) {
        System.out.println(API_Endpoints.BASE_URL.getName());  // called with enum name.BASE_URL.getName()
        System.out.println(API_Endpoints.LOGIN_PAGE.getName()); // directly we can get the constants values that we
        // declared in the enum
        System.out.println(API_Endpoints.DASHBOARD_PAGE.getName());
        System.out.println(API_Endpoints.CHATBOT_PAGE.getName());
        System.out.println(colors.RED.getName());
        System.out.println(colors.GREEN.getName());
        System.out.println(colors.BLUE.getName());
        
        String a = "10989";
        int b = Integer.parseInt(a);     // gives the output in int(Primitive) value
        Integer c = Integer.valueOf(a);  // gives the Object of Integer , used in Lists
      //  System.out.println(c);
        String k = c.toString();     // used to convert the object to String
     //   System.out.println(k);
        String f = c.toString();   // used to convert the object to String
        int d = c;
      //  System.out.println(d);

        String ip = args[0];
        // Taking the input from the arguments
        // 1. Click on down arrow beside the Run button at the Top
        // 2. click on Edit configuration
        // 3. Now enter the string
        // 4. now run the program
        int p = Integer.parseInt(ip);
        int h = 1000/p;  // If you dont enter the input then it will throw the exception
        // "ArrayIndexOutOfBoundsException" and Terminate the program
        // if you enter number 0 as argument then it will throw "ArithmeticException"
        // if you enter the "kumar" as argument then it will throw "NumberFormatException" exception
        System.out.println(h);
//        System.out.println(h);
//        System.out.println(ip);
       // FileInputStream fis = new FileInputStream("C://abc.txt"); // it will ask you to add the exception
        // to method signature, Note - This ia a checked exception(Compile time)
        // and JVM knows this exception
        // Note - JVM will now only "File related" "Input related" "SQL related"

        // Unchecked Exception
        int g = 11;
        System.out.println(g);
        g =  0;  // changed the "g" value to 0
        int e = 10/g;  // Run time exception, JVM will not find the exception like checked exception
        System.out.println(e);  // it will throw Run time exception - Arthemetic exception
//
//        System.out.println(b);
//        System.out.println(f);
      //  System.out.println(c);

    }
}
