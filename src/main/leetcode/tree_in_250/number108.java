package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-13 20:00
 **/

/*
所谓平衡的定义，就是指二叉树的子树高度之差不能超过1。
如果要从一个有序数组中选择一个元素作为根结点，应该选择哪个元素呢？我们应该选择有序数组的中间元素作为根结点。
选择了中间元素作为根结点并创建后，剩下的元素分为两部分，可以看作是两个数组。这样剩下的元素在根结点左边的作为左子树，右边的作为右子树。
 */
public class number108 {
    public TreeNode sortedArrayToBST(int[] numbs) {
        if (numbs.length == 0) {
            return null;
        }
        return BST(numbs, 0, numbs.length);
    }

    private TreeNode BST(int[] numbs, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (high - low) / 2;
        TreeNode node = new TreeNode(numbs[mid]);
        node.left = BST(numbs, low, mid - 1);
        node.right = BST(numbs, mid + 1, high);
        return node;
    }
}

    