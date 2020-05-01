package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-01 14:36
 **/

import java.util.ArrayList;
import java.util.List;

/**
 *中序遍历
 */

public class interview54_230 {
    List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        dfs(root);
        return list.get(list.size()-k);
    }

    private void dfs(TreeNode root) {
        if (root == null ) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}

    