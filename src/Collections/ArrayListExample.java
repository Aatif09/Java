package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1, "Blueberry"); // insert at index

        list.remove("Banana"); // remove element

        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("All elements: " + list);

        list.set(0, "Apricot"); // update element

        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Size: " + list.size());

        list.clear(); // remove all
        System.out.println("Empty? " + list.isEmpty());
    }
}

