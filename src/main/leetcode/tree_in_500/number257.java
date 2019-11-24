package main.leetcode.tree_in_500;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-24 22:39
 **/

/*
二叉树前序遍历的变形，利用一个字符串来记录路径，最后如果当前节点的左右子树都为空就把当前字符串填入到结果集合中。
 */

public class number257 {
    List<String> res=new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){  return res;}
        helper(root, "");
        return res;
    }

    private void helper(TreeNode root, String pre) {
        if (root != null) {
            if (pre == "") {
                pre += root.val;
            }else{
                pre += "->" + root.val;
            }
            if (root.left == null && root.right == null) {
                res.add(pre);
            }
            helper(root.left, pre);
            helper(root.right, pre);
        }
    }
}

    