package main.leetcode.CodingInterviews;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-19 14:41
 **/

public class interview39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


    