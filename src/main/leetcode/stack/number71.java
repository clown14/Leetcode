package main.leetcode.stack;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-28 19:26
 **/

public class number71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        for (String aP : p) {
            if (!stack.isEmpty() && aP == "..") {
                stack.pop();
            } else if (aP != "" && aP != ".." && aP != ".") {
                stack.push(aP);
            }
        }
        return "/" + String.join("/", stack);
    }
}

    