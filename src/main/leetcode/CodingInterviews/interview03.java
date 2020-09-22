package main.leetcode.CodingInterviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    //HashSet
    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num:
             nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}

    