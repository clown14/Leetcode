package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-25 10:24
 **/

/*
判断 若当前结点为空，则返回0
若当前结点的左子树不为空，并且为叶子结点，则sum += 左叶子结点的值
否则，递归左子树。
同理在递归右子树，算出右子树中左叶子节点的和。
最后左子树中左叶子节点的和 加上 右子数中左叶子节点的和即为结果。
 */

public class number404 {
    public int sumofLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }else {
            sum += sumofLeftLeaves(root.left);
        }
        sum += sumofLeftLeaves(root.right);
        return sum;
    }
}

    