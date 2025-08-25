package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Dog");
        set.add("Cat");
        set.add("Dog"); // duplicates not allowed

        System.out.println("HashSet: " + set);
        System.out.println("Contains 'Cat'? " + set.contains("Cat"));
    }
}

