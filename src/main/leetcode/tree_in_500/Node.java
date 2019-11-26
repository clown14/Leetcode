package main.leetcode.tree_in_500;

import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-17 09:51
 **/

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

    