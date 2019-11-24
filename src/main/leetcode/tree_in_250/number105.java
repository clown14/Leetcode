package main.leetcode.tree_in_250;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-11 13:54
 **/

public class number105 {
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
}

    