package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-21 15:31
 **/

/*
充分利用BST的性质：
1.当前值低于左边界值：递归遍历右子树
2.当前值高于右边界值：递归遍历左子树
3.当前值等于左边界值：将当前值加入总和并递归遍历右子树
4.当前值等于右边界值：将当前值加入总和并递归遍历左子树
5.当前值在左右边界之间：将当前值加入总和并分别递归遍历左、右子树
 */

public class number938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val > L) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.val < R) {
            sum += rangeSumBST(root.right, L, R);
        }
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        return sum;
    }
}

    