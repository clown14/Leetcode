package main.leetcode.tree_in_700;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-12 14:42
 **/

/*
递归：
先看根节点：
如果节点值比L还小，说明根节点和左子树都需要被剪掉，继续对右子树进行修剪。
如果节点值比R还大，说明根节点和右子树都需要被剪掉。继续对左子树进行修剪。
如果节点值在区间内:则对左子树和右子树再进行修剪。
 */

public class number669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}

    