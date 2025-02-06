public class Dog extends cat{
    public static void main(String[] args) {

        Dog d=new Dog();
        d.age =10;
        d.name="Raju";
        d.color="Black";
        d.breed="Persianhhhhh";
        d.weight=20.5;
        d.postalcode=1234;
        System.out.println(d.age);
        System.out.println(d.name);
        System.out.println(d.color);
        System.out.println(d.breed);
        System.out.println(d.postalcode);
        d.play();
        d.sleep();
        d.display();

    }
}
