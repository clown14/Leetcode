package main.leetcode.tree_in_500;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-26 20:40
 **/

/*
层次遍历
 */

public class number429 {
    public List<List<Integer>> levelorder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> eachlayer = new LinkedList<>();
            int layersize = eachlayer.size();
            for (int i = 0; i < layersize; i++) {
                root = queue.poll();
                eachlayer.add(root.val);
                for (Node node : root.children) {
                    queue.offer(node);
                }
            }
            res.add(eachlayer);
        }
        return res;
    }
}

    