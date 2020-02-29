package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-29 16:06
 **/

/*
如果根节点值小于val，说明这整棵树都是新的val构成的节点的左子树。
如果根节点值大于val，那么就重新构造右子树。（这个val只可能在根节点的右侧）
 */

public class number998 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            TreeNode newRoot = new TreeNode(val);
            root.left = root;
            return newRoot;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }
}

    