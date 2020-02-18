package main.leetcode.tree_in_1300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-18 20:05
 **/

/*
dfs搜到所有的叶子节点。
用StringBuilder的速度要快于List，用空格是为了避免一个树是[1,2],一个是[12]
 */

public class number872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder left1=new StringBuilder();
        StringBuilder left2=new StringBuilder();
        getLeaf(root1, left1);
        getLeaf(root2, left2);
        return left1.toString().equals(left2.toString());
    }

    private void getLeaf(TreeNode root, StringBuilder res){
        if(root==null)  return;
        if(root.left==null && root.right==null){
            res.append(root.val+"");
        }else{
            getLeaf(root.left,res);
            getLeaf(root.right,res);
        }
    }
}

    