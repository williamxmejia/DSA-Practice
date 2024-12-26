package StackAndQueues;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        myStack.pop();

        System.out.println(myStack.isEmpty());
    }
}
