package main.leetcode.tree_in_700;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-08 17:49
 **/

public class number606 {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return t.val + "";
        }
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
    }
}

    