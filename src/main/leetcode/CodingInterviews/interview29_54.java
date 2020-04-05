package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-05 20:56
 **/

import java.util.LinkedList;
import java.util.List;

/**
 * 模拟螺旋过程，用四个变量代表四个方向，每当该方向的元素遍历完成，对应的方向变量后移或前移，每遍历完一个方向便要检查当前方向是否合法。
 */

public class interview29_54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new LinkedList<>();
        if(matrix == null || matrix.length == 0)
            return res;

        int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while (true) {

            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;
            if (top > bottom) break;

            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if (left > right) break;

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(top > bottom) break;

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right) break;
        }
        return res;
    }
}

    