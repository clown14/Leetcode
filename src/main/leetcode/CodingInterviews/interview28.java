package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-04 21:09
 **/

/**
 * 对称二叉树规律： 对于树中 任意两个对称节点 LL 和 RR ，一定有：
 * L.val = R.val ：即此两对称节点值相等。
 * L.left.val = R.right.val ：即 LL 的 左子节点 和 RR 的 右子节点 对称；
 * L.right.val = R.left.val ：即 LL 的 右子节点 和 RR 的 左子节点 对称。
 */

public class interview28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        }
        if (L == null || R == null || L.val != R.val) {
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}

    