package datastructuresandalgorithms;

public class Main {
    public static void main(String[] args) {
        isBalanced isBalanced =  new isBalanced();

        System.out.println(isBalanced.isBalanced("([])"));
        System.out.println(isBalanced.isBalanced("([))"));
        System.out.println(isBalanced.isBalanced(""));
    }
}
