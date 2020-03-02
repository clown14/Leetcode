package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-02 21:16
 **/

public class number1022 {
    public int sumRootToLeaf(TreeNode root) {
       return getSum(root, 0);
    }

    private int getSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 2 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return getSum(root.left, sum) + getSum(root.right, sum);
    }
}

    