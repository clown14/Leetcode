package main.leetcode.tree_in_250;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-11 13:54
 **/

public class number105 {
    /**
     * 递归
     * 1、前序遍历序列第一个元素一定是该树的根节点。
     * 2、中序遍历序列中根节点前面一定是该树的左子树，后面是该树的右子树。
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || inorder.length==0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return generator(preorder, inorder, map, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode generator(int[] preorder, int[] inorder, Map<Integer, Integer> map,
                               int preStart, int preEnd, int inStart, int inEnd) {
        TreeNode node = new TreeNode(preorder[preStart]);

        if (preStart == preEnd && inStart == inEnd) {
            return node;
        }

        int rootPosition = map.get(preorder[preStart]);
        int leftLen = rootPosition - inStart;
        int rightLen = inEnd - rootPosition;

        if (leftLen > 0)
            node.left = generator(preorder, inorder, map, preStart + 1, preStart + leftLen, inStart, rootPosition - 1);
        if (rightLen > 0)
            node.right = generator(preorder, inorder, map, preStart + leftLen + 1, preEnd, rootPosition + 1, inEnd);

        return node;
    }

    /**
     * 迭代
     * 前序遍历是 中 - 左 - 右 中序遍历是 左- 中 - 右 遍历前序序列并入栈，直到遍历的数值和中序遍历的首个元素相同时，
     * 意味着根节点左侧节点添加完成，出栈到根节点，这时候前序的节点是当前根节点的右侧节点。循环执行上边的操作，完成树的添加。
     */
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        Stack<TreeNode> roots = new Stack<TreeNode>();
        int pre = 0;
        int in = 0;
        //先序遍历第一个值作为根节点
        TreeNode curRoot = new TreeNode(preorder[pre]);
        TreeNode root = curRoot;
        roots.push(curRoot);
        pre++;
        //遍历前序遍历的数组
        while (pre < preorder.length) {
            //出现了当前节点的值和中序遍历数组的值相等，表示左子树添加完成，根据压栈找到对应的根节点，
            // curRoot指向新的根节点，添加右边的节点
            if (curRoot.val == inorder[in]) {
                //每次进行出栈，实现倒着遍历
                while (!roots.isEmpty() && roots.peek().val == inorder[in]) {
                    //curRoot = roots.peek();
                    curRoot = roots.pop();
                    in++;
                }
                //设为当前的右孩子
                curRoot.right = new TreeNode(preorder[pre]);
                //更新 curRoot
                curRoot = curRoot.right;
                roots.push(curRoot);
                pre++;
            } else {
                //否则的话就一直作为左子树
                curRoot.left = new TreeNode(preorder[pre]);
                curRoot = curRoot.left;
                roots.push(curRoot);
                pre++;
            }
        }
        return root;
    }

}

    