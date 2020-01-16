package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-17 22:09
 **/

public class number1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}

    