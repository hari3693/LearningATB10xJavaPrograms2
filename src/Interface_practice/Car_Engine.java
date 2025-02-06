package Interface_practice;

public interface Car_Engine {
    int price = 200000;
    String engine002 = "Petrol";
     default void start2() {
        System.out.println("Default Engine is started");  // Interface can have method
         // with implementation but the method should contain a key word "default"
    }

   public void start();

    public void stop();
}

