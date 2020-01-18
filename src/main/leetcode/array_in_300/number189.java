package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-18 14:58
 **/

/*
将k的左边元素反转，再将k的右边反转，最后整体再反转！
 */

public class number189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return;
        }
        k %= n;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

    