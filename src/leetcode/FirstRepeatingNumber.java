package leetcode;

import java.util.HashMap;

public class FirstRepeatingNumber {
    public int FirstRepeatingNumber(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(list.containsValue(nums[i])){
                return nums[i];
            }else {
                list.put(i, nums[i]);
            }
        }

        return 0;
    }
}
