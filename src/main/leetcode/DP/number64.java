package main.leetcode.DP;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-26 22:37
 **/

/*
动态规划：跟62-不同路径题思路大致相同，只不过当前点值不是取左边和上边的值的和，
而是当前点的值加上min(来自左边方向路径的最小值,来自上边方向路径的最小值)。这样最后的元素值即为左上到右下位置的路径的最小值。
 */

public class number64 {
    public int minPathSum(int[][] grid) {

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {

                if (i == 0 && j > 0)
                    grid[i][j] += grid[i][j - 1];
                if (j == 0 && i > 0)
                    grid[i][j] += grid[i - 1][j];
                if (i > 0 && j > 0)
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}

    