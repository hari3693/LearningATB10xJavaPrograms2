package abstract_practice;

public class lab_runner0 {
    public static void main(String[] args) {
        Normal_Child_1 obj = new Normal_Child_1();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method3(100);
        obj.method4();
        System.out.println(obj.b);  // class variables are non static so we call by object reference
        System.out.println(obj.s);
    }
}
