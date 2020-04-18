package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-18 16:30
 **/

import java.util.LinkedList;
import java.util.List;

/**
 * 深搜，搜到叶子节点判断是否符合条件，若符合条件则将记录该路径的集合添加到结果集合中。
 */

public class interview34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        dfs(root, res, new LinkedList<>(), sum);
        return res;
    }

    public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> every, int target) {

        if (root == null)
            return;
        every.add(root.val);
        if (root.left == null && root.right == null && target - root.val == 0) {
            res.add(new LinkedList<>(every));
            every.remove(every.size() - 1);
            return;
        }
        dfs(root.left, res, every, target - root.val);
        dfs(root.right, res, every, target - root.val);
        every.remove(every.size() - 1);

    }
}

    