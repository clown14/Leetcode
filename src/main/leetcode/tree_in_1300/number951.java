package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-22 20:31
 **/

/*
首先要清楚并不一定是所有的左右子树都翻转，所以存在有的子树左右顺序没变化。
我们就比较root1的左子树和roo2的右子树（或者root2的左子树）并且比较root1的右子树和root2的左子树（或者root2的右子树），若节点值全相等，则是它们互为等价二叉树。
 */

public class number951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val && (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) || flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }

}

    