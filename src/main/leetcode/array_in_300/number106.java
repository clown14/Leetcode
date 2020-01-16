package main.leetcode.array_in_300;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-03 19:28
 **/

/*
此题与105-从先序和中序遍历序列构造二叉树几乎一致，只不过处理数组边界上稍作改动。
 */

public class number106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return generator(postorder, inorder, map, 0, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode generator(int[] postorder, int[] inorder, Map<Integer, Integer> map, int postStart, int postEnd, int inStart, int inEnd) {
        TreeNode node = new TreeNode(postorder[postEnd]);
        if (postStart == postEnd && inStart == inEnd) {
            return node;
        }
        int rootPosition = map.get(postorder[postEnd]);
        int leftLen = rootPosition - inStart;
        int rightLen = inEnd - rootPosition;
        if (leftLen > 0) {
            node.left = generator(postorder, inorder, map, postEnd - leftLen - rightLen, postEnd - rightLen - 1, inStart, rootPosition - 1);
        }
        if (rightLen > 0) {
            node.right = generator(postorder, inorder, map, postEnd - rightLen, postEnd - 1, rootPosition + 1, inEnd);
        }
        return node;
    }
}

    