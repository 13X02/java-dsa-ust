package Assignment2_Course_2.Problem4;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;
        System.out.println("Average: " + average);
    }
}
