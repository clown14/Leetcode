package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-08 16:09
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class number94 {
    /**
     * 递归
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        inorderTree(root,list);
        return list;
    }

    private void inorderTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTree(root.left, list);
        list.add(root.val);
        inorderTree(root.right, list);
    }

    /**
     * 迭代
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ret.add(cur.val);
            cur = cur.right;
        }
        return ret;
    }
}

    