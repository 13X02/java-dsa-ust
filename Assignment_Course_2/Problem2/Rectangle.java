package Assignment_Course_2.Problem2;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 10;
        this.breadth = 10;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    public static void main(String[] args) {
        Rectangle defaultRectangle = new Rectangle();
        defaultRectangle.display();

        Rectangle customRectangle = new Rectangle(5, 7);
        customRectangle.display();
    }
}
