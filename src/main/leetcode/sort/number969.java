package main.leetcode.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-09 21:03
 **/

/*
煎饼反转就是以数组中心索引位置为轴，两两数字交换。例如最后一个数字与第一个数字交换，倒数第二个与第二个交换。

要想实现排序效果，就是依次把最大的放入最后面，这需要以下几步：

找到未排序的数组里面最大的数，并记录索引。

以该索引为数组边界，进行一次煎饼反转，将该数转到第一个数字。

以未排序的子数组边界索引为边界，进行一次煎饼反转，将该数转到最后面。

循环进行。
 */

public class number969 {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        int size = A.length - 1;
        while (size > 0) {
            if (findIndex(A, size) < size) {
                res.add(findIndex(A, size) + 1);
                reverse(A, 0, findIndex(A, size));
                res.add(size + 1);
                reverse(A, 0, size);
            }
            size--;
        }
        return res;
    }

    private static void reverse(int[] A, int i, int j) {
        for (; i < j; i++, j++) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    private static int findIndex(int[] A, int size) {
        int max = 0, k = 0;
        for (int i = 0; i <= size; i++) {
            if (A[i] > max) {
                max = A[i];
                k = i;
            }
        }
        return k;
    }
}

    