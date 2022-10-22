package datastructuresandalgorithms;

import java.util.Stack;

public class isBalanced {

    public boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(top == '[' && c != ']' || top == '(' && c != ')') return false;
            }
        }

        return stack.isEmpty();
    }

}
