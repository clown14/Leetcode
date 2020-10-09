package main.leetcode.CodingInterviews;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-10-09 13:10
 **/

public class interview13 {
    public int movingCount(int m, int n, int k) {
        int result = 0;
        int max = m > n ? m : n;
        // key为数字，value为该数字各位之和
        Map<Integer, Integer> numMap = new HashMap<>(max * 4 / 3 + 1);
        // 记录已经访问过的节点
        boolean[][] visited = new boolean[m][n];
        // 从(0, 0)开始移动
        return move(0, 0, m, n, k, numMap, visited);
    }

    public int move(int x, int y, int m, int n, int k, Map<Integer, Integer> numMap, boolean[][] visited) {
        // 是否越界
        if (x >= m || y >= n) {
            return 0;
        }

        // 如果该节点已经访问过
        if (visited[x][y] == true) {
            // 说明该方格所代表的次数已经被计算过，因此返回0
            return 0;
        }

        // 标记该节点已经访问过
        visited[x][y] = true;
        // 计算
        int xSum = getNumSum(x, numMap);
        int ySum = getNumSum(y, numMap);
        if (xSum + ySum > k) {
            return 0;
        }

        // 尝试向下、向右
        return 1 + move(x + 1, y, m, n, k, numMap, visited) + move(x, y + 1, m, n, k, numMap, visited);
    }

    public int getNumSum(int num, Map<Integer, Integer> numMap) {
        Integer sum = numMap.get(num);
        if (sum != null) {
            return sum;
        }

        int key = num;
        sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        numMap.put(key, sum);
        return sum;
    }
}

    