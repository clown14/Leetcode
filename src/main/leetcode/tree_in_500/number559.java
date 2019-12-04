package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-04 19:01
 **/

public class number559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        for (Node node :
                root.children) {
            depth = Math.max(depth, maxDepth(node));
        }
        return depth+1;
    }
}

    