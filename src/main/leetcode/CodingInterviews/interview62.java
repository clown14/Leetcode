package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-12 14:03
 **/

/**
 * 约瑟夫环
 */

public class interview62 {
    public int lastRemaining(int n, int m) {
        int ans=0;
        for(int i=2; i<=n; i++){
            ans=(ans+m)%i;
        }
        return ans;
    }
}

    