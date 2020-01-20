package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-20 15:02
 **/

public class number217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

    