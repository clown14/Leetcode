package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-20 19:40
 **/

/**
 * 求和，然后判断和是否小于0，因为只要前面的和小于0，那么后面的数加上前面的和就一定比自身小，所以又重新求和，并和之前的最大子序和比较，取最大值。
 */
public class interview42_53 {
    public int maxSubArray(int[] nums) {
        int ans = 0, max = Integer.MAX_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (ans < 0) {
                ans = 0;
            }
            ans += nums[i];
            max = Math.max(ans, max);
        }
        return max;
    }
}

    