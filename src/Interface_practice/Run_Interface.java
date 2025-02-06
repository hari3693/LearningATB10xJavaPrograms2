package Interface_practice;

public class Run_Interface {
    public static void main(String [] args){
     //   Car_Engine engine = new Car_Engine(); // we cannot create the object for the Interface
     //   Car_Engine engine = new Innova();   // we can create object of  a class with reference
        // variable of a Interface
        Innova engine = new Innova();   // We can create the object of a class and call the implementeed
     //   methods of a Interface
        engine.start2();
        engine.start();    // methods called with the object reference
        engine.stop();
        engine.start3();
        engine.stop4();
       // engine.engine_chasi_number();  static methods in interface are not inherited by implementing classes
        Old_car_engine.engine_chasi_number();
        String engine002 = "Desel"; // The variables in the Interface are by default static and final
        int price = 100000;  // If you change the value, it will print old value only
        System.out.println(engine.price);
        System.out.println(engine.engine002);
        System.out.println(Car_Engine.engine002); // we can call the variable with the Interface name
        System.out.println(Car_Engine.price);
    }

}
