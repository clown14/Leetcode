package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-06 14:56
 **/

/**
 * 就是求树深度，只不过递归过程中多了一步，判断当前节点的左右子树深度差绝对值是否是大于1的。
 */

public class interview55_2_110 {
    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        getDepth(root);
        return flag;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1) {
            flag = false;
        }
        return Math.max(left, right) + 1;
    }
}

    