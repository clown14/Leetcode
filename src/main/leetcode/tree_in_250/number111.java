package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-29 15:36
 **/


public class number111 {
    //后序遍历递归
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left!=0 && right!=0){
            return Math.min(left,right)+1;
        }else{
            return Math.max(left,right)+1;
        }
    }

    //迭代
}

    