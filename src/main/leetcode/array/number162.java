package main.leetcode.array;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-13 16:27
 **/

/*
二分法
 */

public class number162 {
    public int findPeekElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

    