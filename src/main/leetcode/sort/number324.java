package main.leetcode.sort;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-05 19:53
 **/

/*
先对nums排序，copy为nums的拷贝。
将copy的右半部分放入nums中以1开始， 间隔为2的位置
将copy的左半部分放入nums中以0开始， 间隔为2的位置
注意，两次操作都为逆序。否则，由于nums中间的元素相等会出错
 */

public class number324 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] copy = nums.clone();
        int index = 1;
        for (int i = nums.length - 1; i > (nums.length - 1) / 2; i--) {
            nums[index] = copy[i];
            index += 2;
        }
        index = 0;
        for (int i = (nums.length - 1) / 2; i >= 0; i--) {
            nums[index] = copy[i];
            index += 2;
        }
    }
}

    