package main.leetcode.greedy;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-26 13:41
 **/

/*
从举例子中我们可以得出任务调度的规律。
如给定：AAABBCD，n=2。那么我们满足个数最多的任务所需的数量，即可以满足任务间隔要求，即：AXXAXXA；（其中，X表示需要填充任务或者idle的间隔）
如果有两种或两种以上的任务具有相同的最多的任务数，如：AAAABBBBCCDE，n=3。那么我们将具有相同个数的任务A和B视为一个任务对，
最终满足要求的分配为：ABXXABXXABXXAB，剩余的任务在不违背要求间隔的情况下穿插进间隔位置即可，空缺位置补idle。
由上面的分析我们可以得到最终需要最少的任务时间：（最多任务数-1）*（n + 1） + （相同最多任务的任务个数）。
有上面的例子来说就是：(num(A)-1) * (3+1) + (2)。
 */

public class number621 {
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for (char t : tasks) {
            c[t-'A']++;
        }
        Arrays.sort(c);
        int i=25;
        while (i > 0 && c[i] == c[25]) {
            i--;
        }
        return Math.max(tasks.length, (c[25] - 1) * (n - 1) + 25 - i);
    }
}

    