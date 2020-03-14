package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-14 16:01
 **/

public class interview14_1 {
    public int cuttingRope(int n) {
        if(n<=3) return n-1;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4; i<=n; i++){
            dp[i]=Math.max(2*dp[i-2], 3*dp[i-3]);
        }
        return dp[n];
    }
}

    