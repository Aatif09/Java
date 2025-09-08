package Collections;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        char[] letters = {'A', 'B', 'C'};

        for (int n : numbers) {
            System.out.println(n);
        }
        for (int n : numbers) {
            n = n * 2;  // only changes the copy of the element, not the array
            System.out.println(n);
        }

        for (char c : letters) {
            System.out.println(c);
        }
    }
}

class NonPrimitiveArrayExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        Integer[] numbers = {1, 2, 3};

        for (String name : names) {
            System.out.println(name);
        }

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}


