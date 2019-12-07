package main.leetcode.tree_in_500;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-07 15:43
 **/

public class number637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum=0.0;
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; i++) {
                root = queue.poll();
                sum += root.val;
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }
            res.add(sum / layerSize);
        }
        return res;
    }
}

    