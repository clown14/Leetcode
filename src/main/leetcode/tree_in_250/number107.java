package main.leetcode.tree_in_250;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-25 16:14
 **/

public class number107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currentRes = new LinkedList<>();
            while(size>0){
                TreeNode cur = queue.poll();
                if(cur==null) continue;
                currentRes.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
                size--;
            }
            res.add(currentRes);
        }
        Collections.reverse(res);
        return res;
    }
}

    