package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-30 15:49
 **/

/**
 * 利用自然数求和公式，再减去当前数组元素的和即为缺失的数字。
 */

public class interview53_2__268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN = (n+1)*n >> 1;
        int sumArray = 0;

        for(int num : nums)
            sumArray += num;

        return sumN - sumArray;
    }
}

    