package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-29 14:19
 **/

/*
现在有一个二叉搜索树，现在要让你删除一个节点，并且保证整个BST的性质不变。
要保证整个性质，我们必须在删除的位置上，找一个合适的值来进行替换，使得BST上的每个节点都满足 当前节点的值大于左节点但是小于右节点
而替换策略就是：
1、当前删除位置，用左边子树的最大值的节点替换
2、或者是，用右边子树的最小值的节点替换
 */

public class number450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            root.val = findReplacement(root, root.left, true);
        } else {
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                root.right = deleteNode(root.right, key);
            }
        }
        return root;
    }

    private int findReplacement(TreeNode parent, TreeNode node, boolean isLeft) {
        if(node.right == null){
            if (isLeft) parent.left = node.left;
            else parent.right = node.left;
            return node.val;
        }
        return findReplacement(node,node.right,false);
    }
}

    