package Assignment2_Course_2.Problem4;
import java.util.Map;
import java.util.TreeMap;
public class MapCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println("Size of map: " + map.size());
    }
}
