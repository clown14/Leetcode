package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-28 17:31
 **/

/*
找到这两个节点，并求出他们的深度和父节点值，如果深度相同并且父节点值不同则为堂兄弟。
 */

public class number993 {
    TreeNode parentX, parentY;
    int dx, dy;

    public boolean isCousins(TreeNode root, int x, int y) {

        getDepth(root, root, x, y, 0);
        return parentX.val != parentY.val && dx == dy;
    }

    public void getDepth(TreeNode root, TreeNode curr, int x, int y, int currDepth) {

        if (root == null)
            return;
        if (root.val == x) {
            parentX = curr;
            dx = currDepth;
        }
        if (root.val == y) {
            parentY = curr;
            dy = currDepth;
        }
        curr = root;
        getDepth(root.left, root, x, y, currDepth + 1);
        getDepth(root.right, root, x, y, currDepth + 1);
    }
}

    