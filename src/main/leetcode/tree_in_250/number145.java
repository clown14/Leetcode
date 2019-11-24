package main.leetcode.tree_in_250;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-21 16:15
 **/

public class number145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        posthelper(root, post);
        return post;
    }

    private static void posthelper(TreeNode root, List<Integer> post) {
        if (root == null) {
            return;
        }
        posthelper(root.left, post);
        posthelper(root.right, post);
        post.add(root.val);
    }
}

    