package main.leetcode.CodingInterviews;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-03 15:48
 **/

public class interview03 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}

    