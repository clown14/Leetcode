package main.leetcode;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-17 21:09
 **/

public class number173 {
    class BSTIterator{
        Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
        }

        public int next() {
            TreeNode temp = stack.pop();
            int val = temp.val;
            if (temp.right != null) {
                temp = temp.right;
                while (temp != null) {
                    stack.add(temp);
                    temp = temp.left;
                }
            }
            return val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}

    