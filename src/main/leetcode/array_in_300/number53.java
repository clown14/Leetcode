package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-30 20:30
 **/

/*
动态规划
求和，然后判断和是否小于0，因为只要前面的和小于0，那么后面的数加上前面的和就一定比自身小，所以又重新求和，并和之前的最大子序和比较，取最大值。
 */
public class number53 {
    public int maxSubArray(int[] nums) {
        int asw = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (asw < 0) {
                asw = 0;
            }
            asw += nums[i];
            max = Math.max(max, asw);
        }
        return max;
    }
}

    