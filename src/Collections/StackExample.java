package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

