package main.leetcode.greedy;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-20 13:35
 **/

public class number1046 {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        for (int i = 0; i < len - 1; i++) {
            Arrays.sort(stones);
            int weight = stones[len - 1] - stones[len - 2];
            stones[len - 1] = weight;
            stones[len - 2] = 0;
        }
        return stones[len - 1];
    }
}

    