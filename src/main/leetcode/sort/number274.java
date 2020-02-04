package main.leetcode.sort;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-04 21:39
 **/

/*
论文里的 h 因子判定，题目的意思可能有点晦涩。h 因子是评判学术成就的一种重要方法，h 因子越高越好，h 因子兼顾研究学术人员的学术产出数量与学术产出质量。
假设一个研究者的 h 因子为 10，则表明该研究者被引用次数大于等于 10 的文章数量也应大于等于 10。
 */

public class number274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int level = 0;
        for(int i = 0; i < citations.length; i++)
            level = Math.max(level,Math.min(citations.length - i,citations[i]));
        return level;
    }
}

    