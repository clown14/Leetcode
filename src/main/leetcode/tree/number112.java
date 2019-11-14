package main.leetcode.tree;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-14 22:42
 **/

/*
dfs:从根节点出发，递归判断左子树是否有满足条件路径，递归判断右子树是否有满足条件路径，若有满足，则终止递归。每次递归都将当前节点的值加入当前总和。
 */

public class number112 {
    boolean flag = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return flag;
    }

    private void dfs(TreeNode root, int currSum, int sum) {
        if (flag || root == null) {
            return;
        }
        if (root.left == null && root.right == null && root.val + currSum == sum) {
            flag = true;
        }
        dfs(root.left, currSum + root.val, sum);
        dfs(root.right, currSum + root.val, sum);
    }
}

    