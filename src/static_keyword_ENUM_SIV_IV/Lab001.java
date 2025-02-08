package static_keyword_ENUM_SIV_IV;

public class Lab001
 {
     int a;
     static int b = 30;
     void cat ()
     {
         System.out.println("Cat is drinking milk");
     }
     static void dog ()
     {
         System.out.println("Dog is walking in the street");
     }
    public static void main(String[] args)
    {
      //  a = 10;   it cant be done because it is Non static variable
     //   b = 20;   it can be done because it is static variable
        Lab001 l = new Lab001();
        l.a = 100;
        System.out.println(l.a);   // Non static variable can be called with the object reference
        System.out.println(l.b);   // we can call the static virables and methods with object reference
        b = 500; // we can assign the value directly to the static variable
      //  a = 100;   we cant assign the value to the Non static variable in the main method
      //  l.a = 200;  we can assign the value to non static variable with the reference variable only
        System.out.println(b);  // static variable can be called with the class name or by name
        System.out.println(Lab001.b); // static variable can be called with the class name or by name
        System.out.println(l.b);  // The changed value of b will be applicable for all the objects
        l.cat();  // Non static method can be called with the object reference
        dog(); // static method can be called without any object reference
        new Lab001();  // Non static will be executed once because object is created
        // and also static is executed once because the class is loaded once
        // Note - static will always executed one time because the class is loaded one time only
        // and Non static will be executed as many times as object is created
       // Lab001 L4;    static block will be executed only once and Non static will not be executed

    }
     static {   // structure to create the Static Block Execution
         System.out.println("static Hello");
     }

     {    // Structure to create the Instance Initializer Block
         System.out.println("Hello");
     }
 }

