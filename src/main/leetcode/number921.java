package main.leetcode;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-13 20:04
 *
 *  给定一个由 ‘(‘ 和 ‘)’ 括号组成的字符串 S，我们需要添加最少的括号（ ‘(‘ 或是 ‘)’，可以在任何位置），以使得到的括号字符串有效。
    从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
    它是一个空字符串，或者
    它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
    它可以被写作 (A)，其中 A 是有效字符串。
    给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 *
 *
 * 此题可以用一个栈（也可以不用，用的话便于理解），将左括号压入栈，如果下一个是右括号就弹出左括号，否则全部压进栈，这样遍历完字串之后在栈中剩下的括号个数即为非法个数。
 **/

public class number921 {
    public int mminAddtoMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && (s.charAt(i) == ')') && (stack.peek() == '(')) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size();
    }
}

    