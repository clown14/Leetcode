package main.leetcode.tree_in_1300;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-19 15:56
 **/

/*
前序遍历为：

(root node) (preorder of left branch) (preorder of right branch)
而后序遍历为：

(postorder of left branch) (postorder of right branch) (root node)
例如，如果最终的二叉树可以被序列化的表述为 [1, 2, 3, 4, 5, 6, 7]，那么其前序遍历为 [1] + [2, 4, 5] + [3, 6, 7]，
而后序遍历为 [4, 5, 2] + [6, 7, 3] + [1].

如果我们知道左分支有多少个结点，我们就可以对这些数组进行分组，并用递归生成树的每个分支。

我们令左分支有 LL 个节点。我们知道左分支的头节点为 pre[1]，但它也出现在左分支的后序表示的最后。
所以 pre[1] = post[L-1]（因为结点的值具有唯一性），因此 L = post.indexOf(pre[1]) + 1。
 */

public class number889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n = pre.length;
        if (n == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        if (n == 1) {
            return root;
        }

        int L = 0;
        for (int i = 0; i < n; i++) {
            if (pre[1] == post[i]) {
                L = i + 1;
            }
        }

        root.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, L + 1), Arrays.copyOfRange(post, 0, L));
        root.right = constructFromPrePost(Arrays.copyOfRange(pre, L+1, n), Arrays.copyOfRange(post, L, n-1));

        return root;
    }
}

    