package OFFICE;

public class Hacker {
    public static void main(String[] args) {
        System.out.println("I am a Hacker");
        Senior_Employee sc = new Senior_Employee("kjndknsk","hijdwojoi");
        sc.Coding();
        sc.Designing();
        sc.Environment_setup();

        Junior_Employee jc = new Junior_Employee("kjndknsk", "hijdwojoi");
        jc.Coding();
        jc.Designing();
        jc.Unit_Testing();
    }
}
