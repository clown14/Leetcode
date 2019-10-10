package main.leetcode;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-10 19:06
 **/

/*
如果数组中有负数，那么就从最小的负数开始取反。若所有负数都取反后K还没用完，并且为奇数（偶数的话随便拿个元素不断取反，最终结果是不变的），
那么就将最后的总和减去当前数组中最小元素的二倍即为最后结果。
 */

public class number1005 {
    class Solution {
        public int largestSumAfterKNegations(int[] A, int K) {
            Arrays.sort(A);
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                if (K>0) {
                    if (A[i] < 0) {
                        A[i] = -A[i];
                        K--;
                    }
                }
                sum += A[i];
            }
            Arrays.sort(A);
            if (K > 0 && K % 2 != 0) {
                sum -= A[0];
            }
            return sum;
        }
    }
}

    