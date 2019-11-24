package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-02 10:40
 **/

public class number222 {
    class solution{
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}

    