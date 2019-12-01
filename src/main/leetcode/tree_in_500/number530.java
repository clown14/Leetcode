package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-01 20:01
 **/

/*
中序遍历二分搜索树，得到数据有序排列，计算当前节点数据与上一个节点数据的绝对值的差值，遍历结束返回最小的绝对值差值。
 */

public class number530 {
    int minDiff = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (pre != null) {
            minDiff = Math.min(minDiff, root.val - pre.val);
        }
        pre = root;
        inOrder(root.right);
    }

}


    