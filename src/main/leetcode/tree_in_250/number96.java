package main.leetcode.tree_in_250;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-09 14:58
 **/

/**
 * 给定 i(1≤i≤n) , 由 1...i 组成的不同的二叉查找树有 f(i) 种
 * 对于 i , 以 k(1≤k≤i) 作为根节点, 左子树的节点为 1,...,k−1 共有 k−1 个节点，右子树的节点为 k+1,...,i 共有 i−k 个节点，
 * 然后左子树的组合数 * 右子树的组合数 即为以 k(1≤k≤i) 作为根节点时的树的组合数量，之后，把所有组合数量累加即为 f(i) 的值。
 */

public class number96 {
    public int numTrees(int n) {
        int [] res = new int[n+1];
        res[0] = 1;

        for (int i = 1; i <= n; ++i) {
            for (int j = i-1; j >= i/2; --j) {
                if (i%2==1 && j == i/2)
                    res[i] += res[j] * res[i-j-1];
                else
                    res[i] += res[j] * res[i-j-1]*2;
            }
        }
        return res[n];
    }
}

    