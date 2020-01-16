package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-02 14:12
 **/

/*
归并排序的简单实现
 */

public class number88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1, y = n - 1, all = m + n - 1;
        for (int i = all; i >= 0; i--) {
            if (x < 0) {
                nums1[i] = nums2[y--];
            } else if (y < 0) {
                nums1[i] = nums2[x--];
            } else if (nums1[x] < nums2[y]) {
                nums1[i] = nums2[y--];
            } else {
                nums1[i] = nums1[x--];
            }
        }
    }
}

    