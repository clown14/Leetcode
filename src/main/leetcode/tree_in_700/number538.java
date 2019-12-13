package main.leetcode.tree_in_700;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-02 11:40
 **/

public class number538 {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    private void convert(TreeNode root) {
        if (root == null) {
            return;
        }
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}

    