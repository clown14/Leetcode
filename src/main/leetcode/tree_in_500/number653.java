package main.leetcode.tree_in_500;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-09 17:34
 **/

/*
关键点在于若集合中包含当前节点值，则返回true，若没有，则放入K-当前节点的值。
 */

public class number653 {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k)) {
            return true;
        }
        set.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}

    