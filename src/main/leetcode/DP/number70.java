package main.leetcode.DP;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-28 21:03
 **/

/*
我们知道第 n 阶只与第 n - 1 阶和 第 n - 2 阶有关，关系为ways[n] = ways[n - 1] + ways[n - 2]，
存储的时候只需要2个存储单元，本题用ways[0]存 n - 2 阶的走法数，ways[1]存储 n - 1 阶走法数
 */

public class number70 {
    public int climbStairs(int n) {
        int[] ways= {1,1};
        for(int i=1; i<n; i++){
            int temp=ways[1];
            ways[1]+= ways[0];
            ways[0]=temp;
        }
        return ways[1];
    }
}

    