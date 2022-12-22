import java.util.Iterator;
import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Apple");
        stack.push("Orange");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Grapes");
        for (String s : stack) {
            System.out.println("Fruits in box " + s);
        }
        System.out.println("Total size of Fruits in Box is "+stack.size());
        System.out.println("Does our stack contains Banana fruit "+stack.search("Banana"));
        System.out.println("Finding element at top of stack "+ stack.peek());
        System.out.println("Removing element "+stack.pop());
        System.out.println("Is our stack Empty? "+stack.empty());
        System.out.println("Adding stack "+ stack.push("Pineapple"));
    }

}
