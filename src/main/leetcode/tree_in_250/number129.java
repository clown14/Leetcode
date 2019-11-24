package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-19 14:55
 **/
/*
深搜：每当向下搜索时，将当前节点的值添加该路径和的末尾，若当前节点为叶子节点，则把该路径的和加到总和上。
 */
public class number129 {
    int pathSum=0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return pathSum;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (root != null && root.left == null & root.right == null) {
            pathSum += sum * 10 + root.val;
        }
        dfs(root.left, sum * 10 + root.val);
        dfs(root.right, sum * 10 + root.val);
    }
}

    