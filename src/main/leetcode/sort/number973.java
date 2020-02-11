package main.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-11 20:33
 **/

/*
重写一个排序算法，把数组内所有的点按距原点的距离从小到大排序，再返回前K个点即可。
 */

public class number973 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}

    