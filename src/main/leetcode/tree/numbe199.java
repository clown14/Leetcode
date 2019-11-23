package main.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-23 19:09
 **/

/*
层次遍历，拿到每一层的最后一个节点值即为二叉树的右视图。
 */

public class numbe199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int layersize = queue.size();
            for (int i = 0; i < layersize; i++) {
                root = queue.poll();
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
                if (i == layersize - 1) {
                    res.add(root.val);
                }
            }
        }
        return res;
    }
}

    