package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-01 15:54
 **/

public class number1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructor(preorder, 0, preorder.length - 1);
    }

    private TreeNode constructor(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(nums[start]);
        int index = getIndex(nums, start + 1, end, nums[start]);
        if (index == -1) {
            root.left = constructor(nums, start + 1, index - 1);
        } else {
            root.left = constructor(nums, start + 1, index - 1);
            root.right = constructor(nums, index, end);
        }
    }

    private int getIndex(int[] nums, int start, int end, int rootVal) {
        for (int i = start; i <= end; i++) {
            if (nums[i] > rootVal) {
                return i;
            }
            return -1;
        }
    }
}

    