package main.leetcode.stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-29 20:58
 **/

/*
由于空节点由’#’表示，那么字符串表示的应该为满二叉树，即入度和出度相等。
我们维护dif = 当前遍历节点出度和 - 当前遍历节点入度和
由于根节点只有出度2，因此dif初始化为1。非叶节点可以使dif增1，叶节点使dif减1

遍历字符串，若dif < 0，返回false，遍历结束，判断dif是否等于0
 */

public class number331 {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1;
        for (String node : nodes) {
            if (--diff < 0) {
                return false;
            }
            if (!node.equals("#")) {
                diff += 2;
            }
        }
        return diff == 0;
    }
}

    