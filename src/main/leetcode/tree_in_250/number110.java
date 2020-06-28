package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-28 15:07
 **/

/**
 * 对于一个节点分别算出每个节点的左、右子树的深度，如果左、右子树深度差大于1，则可以该树非平衡。那么递归每一个节点，
 * 一旦发现某一节点非平衡，就返回false，如果每一节点都平衡，则返回true：
 */

public class number110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getDepth(root.left)-getDepth(root.right))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}

    