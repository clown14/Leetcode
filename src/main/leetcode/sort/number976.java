package main.leetcode.sort;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-12 19:31
 **/

/*
如果a<=b<=c并且a+b>c那么我们可以说a,b,c可以构成三角形。
接下来给数组排序，从数组末尾出发，并设置一个长度为3的滑动窗口，如果当前最大的三个数不能构成三角形，则将滑动窗口左移一个位置，
直到找出可以构成三角形的三边并返回和（如果当前三个值不能构成三角形，那么固定最大值，随便前移另外两个值都不可能，因为前面的值比他们还要小；
如果当前三个值可以构成三角形，那么一定就是周长最大的三角形）。
 */

public class number976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}

    