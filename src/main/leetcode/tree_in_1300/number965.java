package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-25 21:45
 **/

public class number965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val != root.left.val) {
            return false;
        }
        if (root.right != null && root.val != root.right.val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}

    