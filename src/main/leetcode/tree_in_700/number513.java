package main.leetcode.tree_in_700;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-28 23:04
 **/

/*
从右往左层次遍历二叉树
 */

public class number513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) {
                queue.add(root.right);
            }
            if (root.left != null) {
                queue.add(root.left);
            }
        }
        return root.val;
    }
}

    