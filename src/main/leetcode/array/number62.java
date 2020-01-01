package main.leetcode.array;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-01 14:58
 **/

/*
动态规划：我们可以开一个MxN的数组，将起点设为1，代表起点到下一个位置有一种可能性。
每一个元素的值即为从左边走过来的可能数+从上面走过来的可能数（因为只能走下边或者右边），这样数组的最后一个元素，也就是到达终点的可能路径个数。
 */

public class number62 {
    public int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 1;
                }else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[m - 1][n - 1];
    }
}

    