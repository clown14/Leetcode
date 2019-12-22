package main.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-22 13:56
 **/

/*
思路与 三数之和 相同。利用双指针法，在三数之和基础上再加上一层循环。即可实现 四数之和。
 */

public class number18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i + 3 < nums.length; i++) {
            for (int j = i + 1; j + 2 < nums.length; j++) {
                if (i > 0 && nums[i] == nums[i - 1] || j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l<r&&nums[l]==nums[l-1]) l++;
                        while (l<r&&nums[r]==nums[r+1]) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}

    