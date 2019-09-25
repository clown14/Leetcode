package main.leetcode;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-25 22:52
 **/

public class number98 {
    class solution {
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
    }
}

    