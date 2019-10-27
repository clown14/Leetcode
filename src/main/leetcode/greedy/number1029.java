package main.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-09 22:25
 **/

/*
此题基于贪心思想：对cost(A) - cost(B）差值排序，前N小的差值去A花费最小，后面N个你反过来想，就是去B花费最小(比如排序方式变成cost(B) - cost(A))
 */

public class number1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                return (o1[0] - o1[1]) - (o2[0] - o2[1]);
            }
        });
        int res = 0, N = costs.length / 2;
        for (int i = 0; i < N; i++)
            res += costs[i][0] + costs[i + N][1];
        return res;
    }
}

    