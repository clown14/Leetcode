package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-03 22:21
 **/

public class interview27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)  return null;
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}

    