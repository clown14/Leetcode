package main.leetcode.DP;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-27 19:34
 **/

/*
无非就是在上一个题62. 不同路径加了些障碍嘛，做法完全一样

在计算f[i][j]的时候，判断一下上方或者左方有没有障碍物，有的话就说明不能从那个方向过来，不累加那个方向的值就是了

障碍物在终点时属于特殊情况，需要额外注意
 */

public class number63 {
    public int uniquePathWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m <= 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    res[i][j] = 1;
                }
                if (i > 0 && obstacleGrid[i - 1][j - 1] != 1) {
                    res[i][j] += res[i - 1][j];
                }
                if (j > 0 && obstacleGrid[i][j - 1] != 1) {
                    res[i][j] += res[i][j - 1];
                }
            }
        }
        return res[m - 1][n - 1];
    }
}

    