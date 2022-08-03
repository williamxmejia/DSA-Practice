package leetcode;//Kata 6kyu

public class Kata {
    public static int findEvenIndex(int[] arr) {
        // your code
        int left = 0;
        int right = 0;

        for(int i = 0; i < arr.length; i++){
            left += arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            if(right == left - arr[i]){
                return i;
            }
            right += arr[i];
            left -= arr[i];
        }
        return -1;

    }
}