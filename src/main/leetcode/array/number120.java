package main.leetcode.array;

import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-09 14:38
 **/

/*
动态规划：有两种方法， 一种是自顶向下，一种是自底向上，自底向上少了边界控制，代码更便捷。
自底向上:只需要将当前行的元素加上下一行相邻的两个元素中的最小值即可，这样最顶端的值即为整个最短路径的总长度。
 */

public class number120 {
    public int minimumTotal(List<List<Integer>> triangle){
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i+1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}

    