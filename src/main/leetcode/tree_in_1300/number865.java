package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-17 18:02
 **/

/*
一个包含所有最大深度结点的最近祖先一定满足条件：左子树的深度等于右子树的深度；当左子树深度大于右子树深度时，要查找的点一定在左侧，否则在右侧
 */
public class number865 {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return root;
        }
        int l = height(root.left);
        int r = height(root.right);
        if (l == r) {
            return root;
        }
        if (l > r) {
            return subtreeWithAllDeepest(root.left);
        } else {
            return subtreeWithAllDeepest(root.right);
        }
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r);
    }
}

    