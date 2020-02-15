package main.leetcode.tree_in_1300;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-15 16:12
 **/

/*
二叉搜索树的中序遍历的是排好序的，这样只要求出相邻元素之间差值的最小值即可。
 */

public class number783 {
    public int minDiffInBST(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        inOrder(root, values);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < values.size(); i++) {
            min = Math.min(min, values.get(i) - values.get(i - 1));
        }
    }

    private void inOrder(TreeNode root, List<Integer> values) {
        if (root != null) {
            inOrder(root.left, values);
            values.add(root.val);
            inOrder(root.right, values);
        }
    }
}

    