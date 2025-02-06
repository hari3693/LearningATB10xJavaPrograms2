package abstract_practice;

abstract public class Abstract_class_Parent {

   abstract void method1();
   abstract void method4();
   int b = 10;    // class variables are non static
   String s = "Hello";

    void method2()
    {
        System.out.println("Method 2 is normal method from Parent");
    }
    void method3()
    {
        System.out.println("Method 3 is normal method");
    }
    void method3(int a)
    {
        System.out.println("The value of s is" + " " + a);
    }
}
