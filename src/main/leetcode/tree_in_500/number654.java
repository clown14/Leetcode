package main.leetcode.tree_in_500;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-10 15:06
 **/

/*
根据题中最大二叉树定义即可简单得出递归方法，先找到当前范围数组中的最大值，然后作为根节点。最大值的左边元素即为树的左子树，右边元素即为树的右子树。
 */

public class number654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return constructor(nums, 0, nums.length - 1);
    }

    private TreeNode constructor(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int index = getIndex(nums, start, end);
        TreeNode root = new TreeNode(index);
        root.left = constructor(nums, start, index - 1);
        root.right = constructor(nums, index + 1, end);
        return root;
    }

    private int getIndex(int[] nums, int start, int end) {
        int index=start;
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[index]) {
                index = 1;
            }
        }
        return index;
    }
}

    