import java.util.Stack;
public class Stackdemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Top Elements: "+stack.peek());
        stack.pop();
        System.out.println("Stack: "+stack);
        System.out.println("Is stack empty? "+stack.empty());
        System.out.println("Size of stack: "+stack.size());
    } 
}
