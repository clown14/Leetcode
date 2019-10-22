package main.leetcode.greedy;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-22 15:12
 **/

/*
贪心思路：拿最小的，换最大的。
先把令牌按从小到大排好序，这样当我们的能量如果大于当前未使用过的最小令牌，我们就给他拿走，赚取一分并扣除相应能量，
如果能量不够了，我们就去用分数换一个最大的令牌上的能量继续这个过程。用一个变量来记录这整个过程中分数的最大值即为结果，记得每个令牌只允许操作一次！
 */
public class number948 {
    class Solution{
        public int bagOfTokensScore(int[] tokens, int p) {
            int res = 0, point = 0, left = 0, right = tokens.length;
            Arrays.sort(tokens);
            while (left <= right) {
                if (p >= tokens[left]) {
                    p -= tokens[left++];
                    res = Math.max(res, point++);
                } else if (p > 0) {
                    p += tokens[right--];
                    point--;
                } else {
                    break;
                }
            }
            return res;
        }
    }
}

    