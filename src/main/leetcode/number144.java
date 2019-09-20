package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-20 20:04
 **/

/*
利用递归
 */

public class number144 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preOrderTraversal(TreeNode root) {
        recursion(root);
        return list;
    }

    private void recursion(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        recursion(root.left);
        recursion(root.right);
    }

}

    