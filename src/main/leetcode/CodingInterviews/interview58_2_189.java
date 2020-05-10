package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-10 16:44
 **/

/**
 *将k的左边元素颠倒，再将k的右边颠倒，最后整体再颠倒
 */

public class interview58_2_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n < 2)  return;
        k %= n;
        if(k == 0) return;

        Reverse(nums, 0, n - k - 1);
        Reverse(nums, n - k, n - 1);
        Reverse(nums, 0, n - 1);
    }
    static void Reverse(int[] a, int start, int end) {

        while (start <= end) {

            int x = a[start];
            a[start] = a[end];
            a[end] = x;

            start++;
            end--;
        }
    }
}

    