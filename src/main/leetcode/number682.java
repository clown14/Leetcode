package main.leetcode;


import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-14 20:41
 **/

/*
开一个存放操作后结果的值栈：
当是整数，直接压入值栈；
当是”+”，将当前栈中最后两个值的和压入栈
当是”D”，将当前栈中最后一个值的二倍压入栈
当是”C”，将当前栈中最后一个值弹出，最后求出栈中值的和即为答案。
 */

public class number682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op:ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int res = 0;
        for (int s : stack) {
            res += s;
        }
        return res;
    }
}

    