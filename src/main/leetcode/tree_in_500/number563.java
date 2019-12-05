package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-05 15:09
 **/

public class number563 {
    int treeTitle;

    public int findTilt(TreeNode root) {
        dfs(root);
        return treeTitle;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        treeTitle += Math.abs(left - right);
        return left + right + root.val;
    }
}

    