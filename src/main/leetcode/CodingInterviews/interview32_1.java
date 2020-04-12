package main.leetcode.CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-12 14:41
 **/

public class interview32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null)  return new int[0];
        Queue<TreeNode> queue =new LinkedList<>();
        List<Integer> ans= new ArrayList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            ans.add(node.val);
            if(node.left!=null) queue.offer(root.left);
            if(node.right!=null) queue.offer(root.right);
        }

        int[] res= new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}

    