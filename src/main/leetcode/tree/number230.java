package main.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-03 13:11
 **/

public class number230 {
    class Solution{
        List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            dfs(root);
            return list.get(k-1);
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    }
}

    