package Assignment2_Course_2.Problem4;

public class Swapper {
    public static <T> void doSwap(T a, T b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Integer x = 5, y = 10;
        doSwap(x, y);

        String str1 = "Hello", str2 = "World";
        doSwap(str1, str2);
    }
}
