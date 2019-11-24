package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-18 15:07
 **/

/*
这道题目和116题不同的是,这道题的树不是一颗完全二叉树
递归的方法我们不能直接用了,因为我们不去确定连接下一层的时候,节点是谁,所以加入了一个辅助函数:findToLinkedNode
注意，必须先递归右子树，再递归左子树。
 */
public class number117 {
    private Node findToLinkedNode(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left != null) {
            return node.left;
        }
        if (node.right != null) {
            return node.right;
        }
        return findToLinkedNode(node.next);
    }

    public Node connedt(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findToLinkedNode(root.next);
            }
        }
        if (root.right != null) {
            root.right.next = findToLinkedNode(root.next);
        }
        connedt(root.right);
        connedt(root.left);
        return root;
    }
}

    