package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-26 21:18
 **/

/*
知道一个节点的硬币个数，我们就能知道该节点应该拿出多少个硬币给上面：应该是该节点左子树拿出的硬币+该节点右子树拿出的硬币-自身需要的一枚硬币。
以该节点为根节点的树移动的步数自然也清楚：不论是缺硬币还是多硬币都需要移动，所以取绝对值。
 */

public class number979 {
    int res = 0;

    public int distributeCoins(TreeNode root) {

        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {

        if (root == null)
            return 0;
        int left = dfs(root.left), right = dfs(root.right);
        res += Math.abs(left) + Math.abs(right);
        return left + right + root.val - 1;
    }
}

    