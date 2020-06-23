package main.leetcode.tree_in_250;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-23 13:52
 **/


public class number106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0 || inorder.length==0)    return null;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return generator(postorder,inorder,map,0,postorder.length-1,0,inorder.length-1);
    }

    public TreeNode generator(int[] postorder, int[] inorder, Map<Integer,Integer> map,int postStart, int postEnd, int inStart, int inEnd){
        TreeNode node= new TreeNode(postorder[postEnd]);
        if(postStart==postEnd && inStart==inEnd){
            return node;
        }
        int rootPosition= map.get(postorder[postEnd]);
        int leftLen=rootPosition-inStart;
        int rightLen=inEnd-rootPosition;
        if(leftLen>0){
            node.left=generator(postorder,inorder,map,postEnd-leftLen-rightLen,postEnd-rightLen-1,inStart,rootPosition-1);
        }
        if(rightLen>0){
            node.right=generator(postorder,inorder,map,postEnd-rightLen,postEnd-1,rootPosition+1,inEnd);
        }
        return node;
    }
}

    