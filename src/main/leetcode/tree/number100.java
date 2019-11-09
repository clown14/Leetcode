package main.leetcode.tree;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-09 21:32
 **/

public class number100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}

    