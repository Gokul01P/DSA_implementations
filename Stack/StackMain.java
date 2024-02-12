package Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
        CustomStack stack=new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

    }
}
