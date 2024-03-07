package Assignment2_Course_2.Problem1;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class AbstractDemo {
     public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
     }
}
