package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-01 13:57
 **/


public class interview26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null || B != null) && (recur(A, B) || recur(A.left, B) || recur(A, B.left));
    }

    private boolean recur(TreeNode A, TreeNode B){
        if(B==null) return true;
        if(A==null || A.val!=B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }
}

    