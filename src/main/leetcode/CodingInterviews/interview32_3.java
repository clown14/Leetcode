package main.leetcode.CodingInterviews;

import java.util.*;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-15 15:42
 **/

public class interview32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res= new ArrayList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            for(int i=queue.size(); i>0; i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            if(res.size()%2==1) Collections.reverse(tmp);
            res.add(tmp);
        }
        return res;
    }
}

    