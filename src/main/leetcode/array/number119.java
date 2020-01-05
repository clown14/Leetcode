package main.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-05 16:16
 **/

public class number119 {
    public List<Integer> getRow(int row) {
        List<Integer> res = new ArrayList<>(row + 1);
        for (int i = 0; i <= row; i++) {
            res.add(i);
            for (int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}

    