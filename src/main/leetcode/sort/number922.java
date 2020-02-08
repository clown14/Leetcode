package main.leetcode.sort;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-08 21:35
 **/

/*
此题思路是先将数组中所有偶数排到数组前面，将奇数排在后面，如905-按奇偶排序数组
再将前面的奇数位下标的偶数和后面的偶数位下标的奇数交换即可。
 */

public class number922 {
    public int[] sortArrayByParityII(int[] A) {

        int left = 0, right = A.length - 1;
        while (left < right) {

            if (A[left] % 2 == 1 && A[right] % 2 == 0) {
                swap(A, left, right);
                right--;
                left++;
            }
            if (A[left] % 2 == 0)
                left++;
            if (A[right] % 2 == 1)
                right--;
        }
        left = 1;
        right = A.length - 2;
        while (left < right) {

            swap(A, left, right);
            left += 2;
            right -= 2;
        }
        return A;
    }
    public void swap(int[] A, int left, int right) {

        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}

    