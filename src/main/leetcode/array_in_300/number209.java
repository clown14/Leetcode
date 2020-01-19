package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-19 15:11
 **/

/*
双指针的核心思想就是要维护两个指针：一个快指针和一个慢指针，并确定两个指针的移动策略。

首先可以将元素尽量多地累计起来，让它们的和超过s，再按数组的索引，从小到大去掉一些元素，使元素和逼近s，并保持元素和大于等于s。
这个时候，通过一左一右两个指针（索引）就可以计算出最小连续数组的长度。
 */

public class number209 {
    public int minSubArrayLen(int s, int[] nums){
        int len = nums.length;
        int left = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            while (sum >= s) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}

    