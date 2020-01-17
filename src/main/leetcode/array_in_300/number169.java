package main.leetcode.array_in_300;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-17 19:31
 **/

/*
若一个数组中找出一个数并且这个数的个数大于数组长度一半，那么在一个有序数组中，中间元素一定是这个出现次数最多的数。
 */

public class number169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

    