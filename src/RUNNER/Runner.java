package RUNNER;
import OFFICE.*;
public class Runner {

    public static void main(String[] args) {

        Senior_Employee senior = new Senior_Employee("Janihnds","Janihnds");
        senior.getId_Card(1111);
        senior.getFinger_Print(true);
        senior.Environment_setup ();
        senior.Coding();
        senior.Designing();

        Junior_Employee junior = new Junior_Employee("uuuuukop","uuuuukop");
        junior.Coding();
        junior.Designing();
        junior.Unit_Testing();


    }
}
