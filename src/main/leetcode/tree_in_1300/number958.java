package main.leetcode.tree_in_1300;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-24 15:39
 **/

/*
判断完全二叉树，用BFS，每个节点有如下情况：
弹出该节点并进行判断：
1.若该节点同时有左右孩子，则分别压入队列。
2.若该节点有右孩子而没有左孩子，则显然不是完全二叉树。
3.若该节点没有左右孩子，代表是叶子节点，则剩下的节点必须也没有左右孩子，否则不是完全二叉树。
4.若该节点有左孩子而没有右孩子，则把左孩子压入队列，后续处理与3同理，后面的所有节点都不能有左右孩子，不然也不是完全二叉树。
对于以上3，4这两种情况，当出现时，我们用一个bool变量来记录，来进行后续判断。
 */

public class number958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (!flag && (temp.left != null && temp.right != null)) {
                return false;
            }
            if (temp.left != null && temp.right != null) {
                queue.offer(temp.left);
                queue.offer(temp.right);
            } else if (temp.right != null) {
                return false;
            } else if (temp.left != null) {
                flag = false;
                queue.offer(temp.left);
            } else {
                flag = false;
            }
        }
        return true;
    }
}

    