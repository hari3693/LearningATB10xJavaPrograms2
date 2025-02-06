public class cat {
    String name;
    int age;
    String color;
    String breed;
    double weight;
    int postalcode = 12345;

    cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    cat(String name, int age, String color, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
    }

    cat() {
        name = "tom";
        age = 0;
        color = "black";
        breed = "persian";
        weight = 10.5;
    }

    void eat() {
        System.out.println("cat is eating");
    }

    void sleep() {
        System.out.println("cat is sleeping");
    }

    void play() {
        System.out.println("cat is playing");
    }

    void display() {
        System.out.println("Cat details" + this.name + "\n" + this.age + this.color + this.breed + this.weight);
    }
}
