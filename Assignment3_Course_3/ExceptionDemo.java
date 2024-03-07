package Assignment3_Course_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionDemo {
    // Checked Exception
    public static void checkedExceptionExample() throws InterruptedException {
        File file = new File("nonexistent.txt");
        try{
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        
        }
    }

    // Unchecked Exception
    public static void uncheckedExceptionExample() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        // Handling Checked Exception
        try {
            checkedExceptionExample();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occurred: " + e.getMessage());
        }

        // Handling Unchecked Exception
        try {
            uncheckedExceptionExample();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }
}
