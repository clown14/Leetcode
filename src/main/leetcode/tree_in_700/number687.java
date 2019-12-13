package main.leetcode.tree_in_700;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-13 13:45
 **/

/*
如果当前节点值不和父节点相同，则返回0；若相同，则返回左右子树中边数较多的一个，加1是因为当他与父节点的值相同时，和父节点还有一个连线。
maxLen用来动态记录边数最多的路径。
 */

public class number687 {
    int maxLen;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getMaxLen(root, root.val);
        return maxLen;
    }

    private int getMaxLen(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        int left = getMaxLen(root.left,root.val);
        int right = getMaxLen(root.right, root.val);
        maxLen = Math.max(maxLen, left + right);
        if (root.val == val) {
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}

    