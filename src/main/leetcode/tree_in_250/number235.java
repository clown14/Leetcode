package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-04 21:43
 **/

/*
如果root的值和p,q的值相等，则返回root

如果root的值在p,q的值的中间，那么该root就是p,q的公共祖先

如果root的值大于p和q的值，则在root的左子树中寻找p,q的公共祖先

如果root的值大于p和q的值，则在root的右子树中寻找p,q的公共祖先
*/

public class number235 {
    class Solution{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null)
                return null;
            if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val)) {
                return root;
            }
            if (root.val > p.val && root.val > q.val) {
                return lowestCommonAncestor(root.left, p, q);
            }
            if (root.val < p.val && root.val < q.val) {
                return lowestCommonAncestor(root.right, p, q);
            }
            return null;
        }
    }
}

    