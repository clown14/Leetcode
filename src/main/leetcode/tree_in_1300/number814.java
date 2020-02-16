package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-16 18:54
 **/

/*
二叉树剪枝递归思想:
若当前节点为空，返回null;
剪一下左子树；再剪一下右子树；
若当前节点值为0且没有左右子树，剪掉；
 */

public class number814 {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null)
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root.val == 0 && root.left == null && root.right == null ? null : root;
    }
}

    