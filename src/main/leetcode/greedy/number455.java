package main.leetcode.greedy;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-16 19:02
 **/

/*
根据题目，这是一个僧多粥少的事情，孩子多胃口大，要尽量满足更多的孩子，并且每个人都只能有一块饼干；

因此，需要尽量满足胃口小的孩子，才能尽可能多人的满足；
 */

public class number455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            for (; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    j++;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
    