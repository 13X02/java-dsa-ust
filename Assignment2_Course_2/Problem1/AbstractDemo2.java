package Assignment2_Course_2.Problem1;
abstract class Animal {
    abstract void sound();
    
    void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal.sleep();
    }
}
