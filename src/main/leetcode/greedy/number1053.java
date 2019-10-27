package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-17 10:49
 **/

/*
本题让我们找到经过一次交换之后，按字典序排列小于 A 的最大可能排列，

其实就是想让换出的排列刚刚好小于 A，我们需要从右往左找，但是不是找第一个 a[i-1]<a[i]，而是第一个逆序对，
即 a[i-1]>a[i]，然后交换 a[i-1] 和它右方从右往左数第一个小于它的数，就可以满足题目的要求了。

要注意的是，因为元素有可能会相同，这个第一个小于 a[i-1] 的数如果有重复，得取最左边的一个交换。

比如 [1, 9, 4, 7, 7] 的交换一次的结果应该是 [1, 7, 4, 9, 7]，而不是 [1, 9, 4, 7, 9]。

当然，有可能会没有这种数，那就返回原数组就行了。
 */

public class number1053 {
    public int[] prevPermOpt1(int[] A) {
        if (A.length <= 1) {
            return A;
        }
        for (int i = A.length - 1; i > 0; i--) {
            if (A[i - 1] > A[i]) {
                int j = A.length - 1;
                while (A[j] >= A[i - 1] || A[j] == A[j - 1]) {
                    j--;
                }
                int tmp = A[j];
                A[j] = A[i - 1];
                A[i - 1] = tmp;
                break;
            }
        }
        return A;
    }
}

    