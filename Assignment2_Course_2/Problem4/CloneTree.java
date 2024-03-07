package Assignment2_Course_2.Problem4;
import java.util.TreeSet;

public class CloneTree {
    public static void main(String[] args) {
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");
        TreeSet<String> clonedSet = (TreeSet<String>) originalSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);
    }
}
