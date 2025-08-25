package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        System.out.println("HashMap: " + map);
        System.out.println("Value for 'Apple': " + map.get("Apple"));

        map.remove("Banana");
        System.out.println("After removal: " + map);
    }
}

