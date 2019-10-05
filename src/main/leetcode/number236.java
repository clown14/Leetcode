package main.leetcode;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-05 21:59
 **/

/*
dfs，向左右子树找p和q，如果找不到返回null，有了这个思路就可以做题了，如果左右子树都找到了节点，即都不为null时，
说明该root节点就是最近公共祖先，如果有一侧为null，找不到节点，说明2个节点在同一侧，则递归到不为null的子树作为root节点继续查找
 */

public class number236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        } else {
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left != null ? left : right;
        }
    }
}

    