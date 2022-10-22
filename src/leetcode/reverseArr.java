package leetcode;

import java.util.*;
import java.io.*;
import java.math.*;

public class reverseArr {
    public int sumReverse(int[] arr, int target) {
        int totalTarget = arr[arr.length -1];


        while (target != totalTarget) {
            int count = arr.length;
//            if(totalTarget == target){
//                return target;
//            }
            totalTarget = arr[count - 1] + totalTarget;
            count--;
        }

        return totalTarget;
    }

    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        for (int i = 0; i < N; i++) {
//            int X = in.nextInt();
//        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int[] arr = {1, 8, 9, 10};

        int reverseArr = new reverseArr().sumReverse(arr, 6);


        System.out.println("answer " + reverseArr);
    }

}
