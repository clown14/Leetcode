package main.leetcode.tree_in_250;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-07-07 15:48
 **/

//深搜，搜到叶子节点判断是否符合条件，若符合条件则将记录该路径的集合添加到结果集合中。
public class number113 {

    //递归
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new LinkedList<>();

        if(root==null){
            return res;
        }
        dfs(root,res,new LinkedList<>(),sum);
        return res;
    }

    public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> every, int target){
        if(root==null)  return;
        every.add(root.val);
        if(root.left==null && root.right==null&& target==root.val){
            res.add(new LinkedList<>(every));
            every.remove(every.size()-1);
            return;
        }
        dfs(root.left, res, every, target-root.val);
        dfs(root.right, res, every, target-root.val);
        every.remove(every.size()-1);
    }
}

    