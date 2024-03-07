package Assignment2_Course_2.Problem1;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        // Using ==
        System.out.println(str1 == str2); // true

        // Using equals()
        System.out.println(str1.equals(str2)); // true

        // Using compareTo()
        System.out.println(str1.compareTo(str2)); // 0
    }
}
