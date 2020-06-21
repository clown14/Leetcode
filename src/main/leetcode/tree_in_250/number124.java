package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-21 14:39
 **/

/**
 * 二叉树中涵盖某一个节点为根结点的最大路径和，等于该节点的节点值，加上左子树的以根节点为路径起始节点的最大路径和（若为负，直接取0，不要这子树了），
 * 加上右子树的以根节点为路径起始节点的最大路径和（若为负，直接取0，不要这子树了）。
 */

public class number124 {
    private int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        path(root);
        return sum;
    }

    private int path(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(path(root.left), 0);
        int right = Math.max(path(root.right), 0);
        sum = Math.max(sum, left + right + root.val);
        return Math.max(left + root.val, right + root.val);
    }
}

    