package Assignment_Course_2.Problem2;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Even cells:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
