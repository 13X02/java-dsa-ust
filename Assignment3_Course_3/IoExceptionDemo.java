package Assignment3_Course_3;
import java.io.FileReader;
import java.io.IOException;

public class IoExceptionDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
            // Code that may throw IOException
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
