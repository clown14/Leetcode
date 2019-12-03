package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-03 15:38
 **/

/*
最长路径有两种情况：

1. 最长条路径经过根节点，那么只需要找出根节点的左右两棵子树的最大深度然后相加即可。

2. 最长路径没有经过根节点，那么只需要找出根节点的左子树或者根节点的右子树作为根的最长路径度即可。递归调用，自底向上查找子树的深度，
如果某一个左子树与右子树深度之和大于当前纪录的直径，那么替换为当前直径，递归完成之后即可找出直径。
 */

public class number543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
}

    