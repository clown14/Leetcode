package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-27 19:38
 **/

/*
遍历出所有组成的字符串并记录其中字典序最小的即可：
遍历过程中如果当前节点为叶节点，则和当前字典序最小的字符串进行比较并留下较小的那个。整棵树遍历完后答案也出来了。
 */

public class number988 {
    String res=null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return res;
    }

    private void dfs(TreeNode root, String curr) {
        if (root == null) {
            return;
        }
        curr = (char) ('a' + root.val) + curr;
        if (root.left == null && root.right == null) {
            if (res == null) {
                res = curr;
            } else {
                res = res.compareTo(curr) >= 0 ? curr : res;
            }
        }
        dfs(root.left, curr);
        dfs(root.right, curr);
    }
}

    