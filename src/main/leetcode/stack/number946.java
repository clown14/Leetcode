package main.leetcode.stack;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-07 19:02
 **/

public class number946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int elem : pushed) {
            stack.push(elem);
            if (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}

    