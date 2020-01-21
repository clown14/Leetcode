package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-21 20:25
 **/

public class number238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int left = 1;
        for (int i = 0; i < len; i++) {
            if (i > 0) {
                left *= nums[i - 1];
            }
            res[i] = left;
        }
        int rigit = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1) {
                rigit *= nums[i + 1];
            }
            res[i] *= rigit;
        }
        return res;
    }
}

    