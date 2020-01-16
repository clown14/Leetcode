package main.leetcode.array_in_300;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-04 10:36
 **/

/*
每一行操作之后保留，下次循环在此基础上直接将当前值设置为当前值+前一项的值（要从后向前操作，不然所需数据会被更改）
 */

public class number118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> everyRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            everyRow.add(i, 1);
            for (int j = i - 1; j > 0; j--) {
                everyRow.set(j, everyRow.get(j) + everyRow.get(j - 1));
            }
            res.add(new ArrayList<>(everyRow));
        }
        return res;
    }
}

    