package PACKAGE_NAME.leetcode;

import java.util.Stack;

public class AddTwoNumbersII {
    public leetcode.ListNode addTwoNumbers(leetcode.ListNode l1, leetcode.ListNode l2) {
        Stack<Integer> s1 = new Stack<>();

        while (l1 != null){
            s1.push(l1.val);
            l1 = l1.next;

        }

        Stack<Integer> s2 = new Stack<>();

        while (l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        System.out.println(s1);
        System.out.println(s2);

        int carry = 0;
        leetcode.ListNode newHead = null;

        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int n1 = s1.isEmpty() ? 0 : s1.pop();
            int n2 = s2.isEmpty() ? 0 : s2.pop();

            int tmp = n1 + n2 + carry;

            leetcode.ListNode newNode = new leetcode.ListNode(tmp % 10);

            newNode.next = newHead;
            newHead = newNode;
            carry = tmp / 10;

        }


        return newHead;
    }

}
