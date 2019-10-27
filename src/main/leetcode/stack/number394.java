package main.leetcode.stack;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-26 18:37
 **/

/*
维护两个stack

countstack, 存放重复次数
resStack, 存放字符串
迭代字符串s

若遇到数字，则获取对应数字，入栈countstack
若遇到’[‘, 将res(已解码字符串)入栈，置res为空(用来获取’[]’内的字符串)
若遇到’]’, 出栈resStack，出栈countstack,获取重复次数k，重复res k次，添加到出栈字符串上
若为字母，添加到res

 */

public class number394 {
    public String decodeString(String s) {
        if (s.isEmpty() || s == null) {
            return s;
        }
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        String res = "";
        int idx = 0;

        while (idx < s.length()) {
            char c = s.charAt(idx);
            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(idx)) {
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
            } else if (c == '[') {
                resStack.push(res);
                res = "";
                idx++;
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder(resStack.pop());
                int repeat = countStack.pop();
                while (repeat-- > 0) {
                    sb.append(res);
                }
                res = sb.toString();
                idx++;
            } else {
                res += c;
                idx++;
            }
        }
        return res;
    }
}

    