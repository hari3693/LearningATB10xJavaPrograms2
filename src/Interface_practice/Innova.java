package Interface_practice;

public class Innova implements Car_Engine, Old_car_engine{

      @Override
      public void start() {
        System.out.println("Innova Engine is started");
    }
    @Override
    public void stop() {
        System.out.println("Innova Engine is stopped");
    }

    @Override
    public void start3() {
        System.out.println("OLd car Engine is started");
    }

    @Override
    public void stop4() {
          System.out.println("Old car Engine is stopped");
    }
}
