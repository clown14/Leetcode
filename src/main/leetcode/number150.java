package main.leetcode;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-27 21:48
 **/

public class number150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            int length = tokens.length;
            if (length == 0) {
                return 0;
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < length; i++) {
                int tmp;
                try {
                    tmp = Integer.valueOf(tokens[i]);
                    stack.push(tmp);
                } catch (Exception e) {
                    int sec = stack.pop();
                    int fir = 0;
                    if (!stack.isEmpty()) {
                        fir = stack.pop();
                    }
                    if (tokens[i].equals("+")) {
                        tmp = fir + sec;
                    }
                    if (tokens[i].equals("-")) {
                        tmp = fir - sec;
                    }
                    if (tokens[i].equals("*")) {
                        tmp = fir * sec;
                    }
                    if (tokens[i].equals("/")) {
                        tmp = fir / sec;
                    }
                    stack.push(tmp);
                }
            }
            return stack.pop();
        }
    }
}

    