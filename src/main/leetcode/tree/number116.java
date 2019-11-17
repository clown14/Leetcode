package main.leetcode.tree;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-17 09:49
 **/

public class number116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left.next = root.right;
        }
        if (root.right != null) {
            root.right.next = root.next != null ? root.next.left : null;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}

    