package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-12 20:17
 **/

/*
动态规划思想，max & min
每有一个新的数字加入，最大值要么是当前最大值*新数，要么是当前最小值（负数）*新数（负数），要么是当前值。
 */

public class number152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], min = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > res) {
                res = max;
            }
        }
        return res;
    }
}

    