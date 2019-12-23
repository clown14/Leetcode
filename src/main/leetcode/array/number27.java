package main.leetcode.array;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-23 22:21
 **/

/*
保留两个指针 i 和 j，其中 i 是慢指针，j 是快指针。
当 nums[j] 与给定的值相等时，递增 j 以跳过该元素。只要 nums[j]!=val ，我们就复制 nums[j] 到 nums[i] 并同时递增两个索引。
重复这一过程，直到 j 到达数组的末尾，该数组的新长度为 i。
 */

public class number27 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

    