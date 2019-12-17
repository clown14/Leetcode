package main.leetcode.tree_in_700;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-16 16:11
 **/

/*
如果当前节点值>待插入节点值，则递归修改左子树，否则修改右子树。
 */

public class number701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)  return new TreeNode(val);
        else if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}

    