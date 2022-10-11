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

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println("Fruits in box "+itr.next());
        }
        System.out.println("Total size of Fruits in Box is "+stack.size());
    }

}
