package leetcode;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        int leftSum = 0;
        int rightSum = 0;

        for(int i =0; i < nums.length; i++){
            rightSum = total - nums[i] - leftSum;
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
