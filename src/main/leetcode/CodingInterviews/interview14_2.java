package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-10-16 19:27
 *
 * n小于4时，返回n-1;
 * n等于4时，返回4；
 * n大于4时，就要切割成长度为3的小段，只要n还大于4，每切除一段3，就累乘起来，然后取模。
 **/

public class interview14_2 {
    public int cuttingRope(int n) {
        if(n < 4){
            return n - 1;
        }else if(n == 4){
            return n;
        }
        long res = 1;
        while(n > 4){
            res *= 3;
            res %= 1000000007;
            n -= 3;
        }
        return (int) (res*n%1000000007);
    }
}

    