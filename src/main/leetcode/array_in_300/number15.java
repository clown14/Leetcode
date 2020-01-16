package main.leetcode.array_in_300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-21 18:50
 **/

/*
先把数组排序
从小到大遍历这个数组，每次取一个元素，将这个元素的相反数设为target
在每次遍历中，使用双指针对当前元素的后面的所有元素进行处理，找到两个元素的和为target，这样，三个元素的和就是 0
双指针的具体处理方式为：头尾各一个指针，每次判断两个指针所指的元素的和与target的大小，如果和小了，左指针右移；如果和大了，右指针左移，直到两个指针相遇
 */

public class number15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // skip same result
            }
            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++; // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--; // skip same result
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
}

    