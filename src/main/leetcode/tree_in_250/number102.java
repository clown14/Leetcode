package main.leetcode.tree_in_250;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-29 20:41
 **/

public class number102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new LinkedList<>();
            if (root == null) {
                return res;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> currentRes = new LinkedList<>();
                while (size > 0) {
                    TreeNode cur = queue.poll();
                    if (cur == null) {
                        continue;
                    }
                    currentRes.add(cur.val);
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                    size--;
                }
                res.add(currentRes);
            }
            return res;
        }
    }
}

    