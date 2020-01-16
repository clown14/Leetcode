package main.leetcode.array;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-16 16:14
 **/

/*
定义两个下标， 一个在起始位置，一个在结束位置。
当两个位置所存的元素相加 = 给定值则返回
当两个位置所存元素相加 > 给定值，则在结束位置的下标向前移（因为数组是升序的）
当两个位置所存元素相加 < 给定值，则在起始位置的下标向后移
如此循环
 */

public class number167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start] + numbers[end];
            if (temp == target) {
                return new int[]{start, end};
            }
            if (temp < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }
}

    