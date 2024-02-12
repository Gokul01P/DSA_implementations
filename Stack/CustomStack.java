package Stack;

import java.util.Arrays;

public class CustomStack {
    int[] stack;
    private static final int DefaultSize=10;
    int top=-1;
    public CustomStack(){
        this(DefaultSize);
    }
    public CustomStack(int size){
        stack=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        stack[++top]=item;
        return true;
    }
    public boolean isFull(){
        return top==stack.length-1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }return stack[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        return stack[top];
    }
    public int size(){
        return top+1;
    }
    @Override
    public String toString(){
        return Arrays.toString(stack);
    }
}
