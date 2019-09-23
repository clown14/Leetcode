package main.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-23 20:01
 **/

/*
建立两个栈stack1和stack2
把二叉树的根节点push进stack1
使用一个while循环，pop当前节点的子结点，然后push进另一个栈，这样每处理一个栈，就在最终结果ans里面加一个列表（当前深度的节点
 */

public class number103 {
    public List<List<Integer>> zigzagLevelOrder (TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode cur = root;
        stack1.push(cur);
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            while (!stack1.isEmpty()) {
                cur = stack1.pop();
                temp.add(cur.val);
                if (cur.left != null) {
                    stack2.push(cur.left);
                }
                if (cur.right != null) {
                    stack2.push(cur.right);
                }
            }
            ans.add(temp);
            temp = new ArrayList<>();
            while (!stack2.isEmpty()) {
                cur = stack2.pop();
                temp.add(cur.val);
                if (cur.right != null) {
                    stack1.push(cur.right);
                }
                if (cur.left != null) {
                    stack1.push(cur.right);
                }
            }
            if (!temp.isEmpty()) {
                ans.add(temp);
            }
        }
        return ans;
    }
}

    