package main.leetcode.tree_in_250;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-18 15:59
 **/

public class number104 {
    //递归
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    //迭代
    public int maxDepth2(TreeNode root) {
        if(root==null) return 0;
        int res=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            while(size>0){
                TreeNode cur= queue.poll();
                if(cur==null) continue;
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
                size--;
            }
            res++;
        }
        return res;
    }
}

    