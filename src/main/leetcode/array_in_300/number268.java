package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-23 18:05
 **/

/*
利用自然数求和公式，再减去当前数组元素的和即为缺失的数字。
 */

public class number268 {
    public int missingNumber(int[] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return a.length * (a.length + 1) / 2 - sum;
    }
}

    