package Assignment2_Course_2.Problem1;
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }
}
