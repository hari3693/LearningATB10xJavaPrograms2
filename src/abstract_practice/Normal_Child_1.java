package abstract_practice;

public class Normal_Child_1 extends Abstract_class_Parent{
            @Override
            void method1() {
                System.out.println("Method 1 is abstract method from Parent");
            }

    @Override
    void method4() {
        System.out.println("Method 4 is abstract method from Parent");
    }
    void method2()
    {
        super.method2();
        System.out.println("Method 2 is normal method from Child");

    }
}
