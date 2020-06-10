package main.leetcode.tree_in_250;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-25 22:52
 **/
public class number98 {

    /**
     * 中序遍历递归
     */

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val < low || root.val > high) {
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

    /**
     * 栈
     */
    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root, pre = null;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (pre != null && p.val <= pre.val) {
                return false;
            }
            pre = p;
            p = p.right;
        }
        return true;
    }
}




    