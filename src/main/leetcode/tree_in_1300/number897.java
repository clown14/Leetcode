package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-20 16:17
 **/

/*
利用全局变量， 每当遍历一个节点则添加到当前新树的右子树上去并将指针指向新树的右叶子节点以便继续添加。
 */

public class number897 {
    TreeNode newTree, head;

    public TreeNode increasingBST(TreeNode root) {

        newTree = new TreeNode(0);
        head = newTree;
        helper(root);
        return head.right;
    }

    public void helper(TreeNode root) {

        if (root == null)
            return;
        helper(root.left);
        newTree.right = new TreeNode(root.val);
        newTree = newTree.right;
        helper(root.right);
    }
}

    